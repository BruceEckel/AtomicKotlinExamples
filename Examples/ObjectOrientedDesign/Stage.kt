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
  fun teleportPairs() = rooms.map { it.actor }
    .filterIsInstance<Teleport>()
    .sortedBy { it.symbol }.chunked(2)
  init { // The 'Builder' pattern:
    // Step 1: Find the Robot:
    robot.room = rooms.first {
      it.actor.symbol == robot.symbol
    }
    // Step 2: Connect the doors
    rooms.forEach {
      it.doors.connect(it.row, it.col, rooms)
    }
    // Step 3: Connect the Teleport pairs
    for ((a, b) in teleportPairs()) {
      a.target = b.room
      b.target = a.room
    }
  }
}
