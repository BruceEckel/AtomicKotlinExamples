// ObjectOrientedDesign/MazeView.kt
package oodesign

fun Stage.showMaze() = mazeView() +
  "\n\nEnergy: ${robot.energy}\n"

fun Stage.mazeView(): String {
  var result = ""
  var currentRow = 0
  rooms.forEach {
    if (it.row != currentRow) {
      result += "\n"
      currentRow = it.row
    }
    result += it.agent.id()
  }
  return result
}
