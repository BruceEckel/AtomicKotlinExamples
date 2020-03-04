// ObjectOrientedDesign/View.kt
package robotexplorer

class View(val stage: Stage) {
  val height = stage.maze.lines().size + 3
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clear() = print("${ansiTerm}${height}T")
  fun show() {
    print("${ansiTerm}0;0H") // Cursor home
    println(stage.showMaze())
    Thread.sleep(300L) // Pause
  }
}
