// RobotExplorer2/Stage2.kt
package robotexplorer2
import robotexplorer.urge

class Stage(val maze: String) {
  val robot = Robot(Room())
  val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  private val view = View(this)
  val lines = maze.split("\n")
  init { // The 'Builder' pattern:
    // Step 1: Create rooms with players:
    lines.withIndex().forEach { (row, line) ->
      line.withIndex().forEach { (col, ch) ->
        val room = factory(ch)
        rooms[Pair(row, col)] = room
        if(ch == robot.symbol)
          robot.room = room
      }
    }
    // Step 2: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 3: Connect the Teleport pairs
    val teleportPairs = rooms.values
      .filter {
        it.player is Teleport
      }.map {
        it.player as Teleport
      }.sortedBy {
        it.target
      }.zipWithNext()
    for((a, b) in teleportPairs) {
      a.targetRoom = b.room
      b.targetRoom = a.room
    }
  }
  fun run(solution: String) {
    view.clear()
    view.show() // Show initial maze
    solution.filter { !it.isWhitespace() }
      .forEach {
        robot.move(urge(it))
        view.show()
      }
  }
}
