// ObjectOrientedDesign/MazeView.kt
package oodesign

fun Stage.showMaze() = mazeView() +
  "\n\nEnergy: ${robot.energy}\n"

fun Stage.mazeView(): String {
  var result = ""
  var currentRow = 0
  rooms.forEach { (_, room) ->
    if (room.row != currentRow) {
      result += "\n"
      currentRow = room.row
    }
    result += room.agent.id()
  }
  return result
}
