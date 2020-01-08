// ObjectOrientedDesign/Stage.kt
package robotexplorer1
import robotexplorer1.Player.*

class Stage(val maze: String) {
  val robot = Robot(Room(Empty))
  val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  private val view = View(this)
  val lines = maze.split("\n")
  // Construct it with the 'Builder' pattern:
  fun build(): Stage {
    // Step 1: Create the empty rooms:
/*
    (0..lines.size).forEach { row ->
      (0 until lines[0].length).forEach {
        col -> rooms[Pair(row, col)] = Room()
      }
    }
*/
    // Step 2: Add players to rooms:
    lines.withIndex().forEach { (row, line) ->
      line.withIndex().forEach { (col, char) ->
//        val room = rooms.getOrDefault(
//          Pair(row, col), Room())
        val room = Room()
        factory2(char, room, robot)
        rooms[Pair(row, col)] = room
/*
        when(val player = factory(char)) {
          is Robot -> robot.room = room
          is Teleport -> {
            player.originRoom = room
            room.player = player
            teleports.add(player)
          }
          else -> room.player = player
        }
*/
      }
    }
    // Step 3: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 4: Connect the Teleport rooms
    val teleports = mutableListOf<Teleport>()
    rooms.forEach { (pair, r) ->
      val p = r.player
      if (p is Teleport)
        teleports.add(p)
    }
    val pairs = teleports
      .sortedBy {
        it.target
      }.zipWithNext()
    for((a, b) in pairs) {
      a.targetRoom = b.originRoom
      b.targetRoom = a.originRoom
    }
    return this
  }
  fun run(solution: String) {
    view.clear()
    view.show() // Show initial maze
    for(urgeChar in
        solution.filter { it.isLetter() }) {
      robot.move(urge(urgeChar))
      view.show()
    }
  }
}
