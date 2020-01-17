// ObjectOrientedDesign/Stage.kt
package robotexplorer

class Stage(val maze: String) {
  val robot = Robot(Room())
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
      line.withIndex().forEach { (col, ch) ->
        rooms[Pair(row, col)] = factory(ch)
      }
    }
    // Step 2: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 3: Connect the Teleport pairs
    val pairs = rooms.values
      .filter {
        it.player is Teleport
      }.map {
        it.player as Teleport
      }.sortedBy {
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
    solution.filter { !it.isWhitespace() }
      .forEach {
        robot.move(urge(it))
        view.show()
      }
  }
}
