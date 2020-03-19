// ObjectOrientedDesign/MazeView.kt
package oodesign

fun Stage.mazeView(): String {
  var currentRow = 0
  fun Room.newline() =
    if (row != currentRow) {
      currentRow = row
      "\n"
    } else ""
  return rooms.joinToString("") {
    it.newline() + it.actor.id()
  }
}
