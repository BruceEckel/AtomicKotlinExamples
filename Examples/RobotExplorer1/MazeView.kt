// RobotExplorer1/MazeView.kt
package robotexplorer1

fun Stage.mazeView(): String {
  var result = ""
  var currentRow = 0
  rooms.forEach { (pair, room) ->
    val row = pair.first
    if (row != currentRow) {
      result += "\n"
      currentRow = row
    }
    result += if (room == robot.room)
      "$robot" else "${room.player}"
  }
  return result +
    "\n\nEnergy: ${robot.energy}\n"
}
