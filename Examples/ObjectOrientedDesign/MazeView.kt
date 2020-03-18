// ObjectOrientedDesign/MazeView.kt
package oodesign

fun Stage.showMaze() = mazeView() +
  "\n\nEnergy: ${robot.energy}\n"

fun Stage.mazeView(): String {
  var result = ""
  var currentRow = 0
  rooms.forEach { (coordinates, room) ->
    val row = coordinates.first
    if (row != currentRow) {
      result += "\n"
      currentRow = row
    }
    result += if (room == robot.room)
      robot.id() else room.agent.id()
  }
  return result
}
