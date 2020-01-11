// ObjectOrientedDesign/Stage.kt
package robotexplorer1
import robotexplorer1.Player.*

class Stage(val maze: String) {
  val robot = Robot(Room(Empty))
  val rooms =
    mutableMapOf<Pair<Int, Int>, Room>()
  private val view = View(this)
  val lines = maze.split("\n")
  private fun factory(ch: Char): Room {
    val room = Room()
    if(ch == 'R') {
      robot.room = room
      return room
    }
    Player.values().forEach {
      if (ch == it.symbol) {
        room.player = it
        return room
      }
    }
    val teleport = Teleport(ch)
    room.player = teleport
    teleport.originRoom = room
    return room
  }
  // Construct it with the 'Builder' pattern:
  fun build(): Stage {
    // Step 1: Create rooms with players:
    lines.withIndex().forEach { (row, line) ->
      line.withIndex().forEach { (col, char) ->
        rooms[Pair(row, col)] = factory(char)
      }
    }
    // Step 2: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 3: Connect the Teleport rooms
    val teleports = mutableListOf<Teleport>()
    rooms.forEach { (pair, r) ->
      val p = r.player
      if (p is Teleport)
        teleports.add(p)
    }
    val pairs = teleports.sortedBy {
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
