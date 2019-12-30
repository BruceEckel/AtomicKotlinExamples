// ObjectOrientedDesign/View.kt
package robotexplorer1
import robotexplorer1.Player.*

class View(private val stage: Stage) {
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clearViewport(size: Int) =
    print("${ansiTerm}${size}T")
  private fun mazeView(): String {
    var result = ""
    var currentRow = 0
    stage.rooms.forEach { (pair, room) ->
      val row = pair.first
      if (row != currentRow) {
        result += "\n"
        currentRow = row
      }
      result += if (room == stage.robot.room)
        "${stage.robot}" else "${room.player}"
    }
    return result + "\n\n\n"
  }
  fun step(urge: Urge? = null) {
    if(urge != null)
      stage.robot.move(urge)
    print("${ansiTerm}0;0H") // Cursor home
    println(mazeView())
    Thread.sleep(300L)
  }
}
