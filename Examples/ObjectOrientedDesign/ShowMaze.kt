// ObjectOrientedDesign/ShowMaze.kt
package robotexplorer

fun Stage.showMaze() = mazeView() +
  "\n\nEnergy: ${robot.energy}\n"

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
      robot.id() else room.player.id()
  }
  return result
}
