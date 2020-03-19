// ObjectOrientedDesign/Stage.kt
package oodesign

class Stage(val maze: String) {
  val lines = maze.split("\n")
  val height = lines.size
  val width = lines[0].length
  val robot = Robot(Room())
  val rooms: Rooms = mutableMapOf()
  val xrooms =
    lines.withIndex().map { (row, line) ->
      line.withIndex().map { (col, ch) ->
        Factory.make(ch, row, col)
      }
    }.flatten()
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
        rooms[Pair(row, col)] =
          Factory.make(ch, row, col)
      }
    }
    // Step 2: Find the Robot:
    robot.room = rooms.values.first {
      it.agent.symbol == robot.symbol
    }
    // Step 3: Connect the doors
    rooms.forEach { (_, r) ->
      r.doors.connect(r.row, r.col, rooms)
    }
    // Step 4: Connect the Teleport pairs
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
  println(stage.robot)
  stage.xrooms.forEach { println(it) }
}
