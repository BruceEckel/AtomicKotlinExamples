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

class View(private val stage: Stage) {
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clearViewport(size: Int) =
    print("${ansiTerm}${size}T")
  private fun mazeView(): String {
    var result = ""
    var currentRow = 0
    stage.rooms.forEach { (pair, room) ->
      val row = pair.first
      if (row != currentRow) {
        result += "\n"
        currentRow = row
      }
      result += if (room == stage.robot.room)
        "${stage.robot}" else "${room.player}"
    }
    return result + "\n\n\n"
  }
  fun step(urge: Urge? = null) {
    if(urge != null)
      stage.robot.move(urge)
    print("${ansiTerm}0;0H") // Cursor home
    println(mazeView())
    Thread.sleep(300L)
  }
}