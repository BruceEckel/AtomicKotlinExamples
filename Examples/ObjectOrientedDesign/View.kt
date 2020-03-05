// ObjectOrientedDesign/View.kt
package oodesign

class MazeState(val stringRep: String) {
  data class Element(
    val row: Int,
    val col: Int,
    val char: Char
  )
  private var row = 0
  private var col = 0
  val state = stringRep.map {
    if (it == '\n') {
      row++
      col = 0
      null
    } else Element(row, col++, it)
  }.filterNotNull()
}

class View(val stage: Stage) {
  var current = MazeState(stage.showMaze())
  val height = stage.maze.lines().size + 3
  // Start an ANSI terminal control string:
  private val ansiTerm = "\u001B["
  fun clear() = print("${ansiTerm}${height}T")
  fun moveTo(x: Int, y: Int) =
    print("${ansiTerm}${x};${y}H")
  fun display() {
    moveTo(0, 0)
    println(stage.showMaze())
  }
  fun update() {
    val next = MazeState(stage.showMaze())
    current.state.zip(next.state)
      .filter {
        it.first.char != it.second.char
      }.forEach {
        moveTo(it.second.row, it.second.col)
        print(it.second.char)
      }
    current = next
  }
}
