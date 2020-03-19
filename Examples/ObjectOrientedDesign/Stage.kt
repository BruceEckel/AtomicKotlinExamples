// ObjectOrientedDesign/Stage.kt
package oodesign

class Stage(val maze: String) {
  val lines = maze.split("\n")
  val height = lines.size
  val width = lines[0].length
  val robot = Robot(Room())
  val rooms: List<Room> =
    lines.withIndex().map { (row, line) ->
      line.withIndex().map { (col, ch) ->
        Factory.make(ch, row, col)
      }
    }.flatten()
  fun teleportPairs() = rooms
    .filter {
      it.agent is Teleport
    }.map {
      it.agent as Teleport
    }.sortedBy {
      it.target
    }.chunked(2)
  init { // The 'Builder' pattern:
    // Step 1: Find the Robot:
    robot.room = rooms.first {
      it.agent.symbol == robot.symbol
    }
    // Step 2: Connect the doors
    rooms.forEach {
      it.doors.connect(it.row, it.col, rooms)
    }
    // Step 3: Connect the Teleport pairs
    for ((a, b) in teleportPairs()) {
      a.targetRoom = b.room
      b.targetRoom = a.room
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
  stage.rooms.forEach { println(it) }
}
