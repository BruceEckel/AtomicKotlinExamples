// ObjectOrientedDesign/Stage.kt
package oodesign

class Stage(val maze: String) {
  val lines = maze.split("\n")
  val height = lines.size
  val width = lines[0].length
  val robot = Robot(Room())
  val rooms: List<Room> =
    lines.withIndex().flatMap { (row, line) ->
      line.withIndex().map { (col, ch) ->
        Factory.make(ch, row, col)
      }
    }
  fun teleportPairs() = rooms.map { it.actor }
    .filterIsInstance<Teleport>()
    .sortedBy { it.symbol }.chunked(2)
  init { // The 'Builder' pattern:
    // Step 1: Connect the doors
    rooms.forEach {
      it.doors.connect(it.row, it.col, rooms)
    }
    // Step 2: Connect the Teleport pairs
    for ((a, b) in teleportPairs()) {
      a.target = b.room
      b.target = a.room
    }
    // Step 3: Find the Robot:
    robot.room = rooms.first {
      it.actor.symbol == robot.symbol
    }
  }
}
