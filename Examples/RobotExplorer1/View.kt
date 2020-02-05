// RobotExplorer1/View.kt
package robotexplorer1

class View(private val stage: Stage) {
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clear() {
    val size = stage.maze.lines().size + 3
    print("${ansiTerm}${size}T")
  }
  fun show() {
    print("${ansiTerm}0;0H") // Cursor home
    println(stage.mazeView())
    Thread.sleep(300L) // Pause
  }
}
