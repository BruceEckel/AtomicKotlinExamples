// ObjectOrientedDesign/Stage.kt
package robotexplorer1
import robotexplorer1.Player.*

class Stage(val maze: String) {
  val robot = Robot(Room(Empty))
  val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  private val view = View(this)
  // Construct it with the 'Builder' pattern:
  fun build(): Stage {
    // Step 1: Create the unconnected rooms:
    val lines = maze.split("\n")
    lines.withIndex().forEach { (r, line) ->
      line.withIndex().forEach { (c, char) ->
        when(val player = factory(char)) {
          is Robot ->
            rooms[Pair(r, c)] = robot.room
          else ->
            rooms[Pair(r, c)] = Room(player)
        }
      }
    }
    // Step 2: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 3: Connect the Teleport rooms
    val teleports: List<Room> = rooms.values
      .filter { it.player is Teleport }
      .sortedBy {
        (it.player as Teleport).target
      }
    for((a, b) in teleports.zipWithNext()) {
      (a.player as Teleport).targetRoom = b
      (b.player as Teleport).targetRoom = a
    }
    return this
  }
  fun run(solution: String) {
    view.clearViewport(
      stringMaze.lines().size + 3)
    view.step() // Show initial maze
    for(urgeChar in
        solution.filter { it.isLetter() })
      view.step(urge(urgeChar))
  }
}
