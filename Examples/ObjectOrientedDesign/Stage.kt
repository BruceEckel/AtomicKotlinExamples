// ObjectOrientedDesign/Stage.kt
package oodesign

class Stage(val maze: String) {
  val lines = maze.split("\n")
  val height = lines.size
  val width = lines[0].length
  val robot = Robot(Room())
  val rooms: Rooms = mutableMapOf()
  private val view = View(this)
  fun teleportPairs() = rooms.values
    .filter {
      it.agent is Teleport
    }.map {
      it.agent as Teleport
    }.sortedBy {
      it.target
    }.chunked(2)
  init { // The 'Builder' pattern:
    // Step 1: Create rooms with agents:
    lines.withIndex().forEach { (row, line) ->
      line.withIndex().forEach { (col, ch) ->
        val room = Factory.make(ch, row, col)
        rooms[Pair(row, col)] = room
        if (ch == robot.symbol)
          robot.room = room
      }
    }
    // Step 2: Connect the doors
    rooms.forEach { (pair, r) ->
      r.doors.connect(
        pair.first, pair.second, rooms)
    }
    // Step 3: Connect the Teleport pairs
    for ((a, b) in teleportPairs()) {
      a.targetRoom = b.room
      b.targetRoom = a.room
    }
  }
  fun run(solution: String) {
    view.clear()
    view.display() // Show initial maze
    solution.filter { !it.isWhitespace() }
      .forEach {
        robot.move(urge(it))
        view.display()
        Thread.sleep(200L) // Pause
      }
  }
}

fun main() {
  val teleports = stringMaze.toCharArray()
    .sorted().filter{ it.isLowerCase() }
  println("${teleports.size} $teleports")
  val stage = Stage(stringMaze)
  val pairs = stage.teleportPairs()
  println("${pairs.size}")
  pairs.forEach { println(it) }
  stage.rooms.values.filter {
    it.agent.symbol.isLetter()
  }.forEach { println(it.agent.symbol) }
}
