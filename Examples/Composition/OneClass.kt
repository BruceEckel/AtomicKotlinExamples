// Composition/OneClass.kt
package oneclass

interface Element
class Position

interface Maze { /* ... */ }

class MazeImpl(
  val representation: String,
  val width: Int,
  val height: Int
): Maze {

  private val cells = Array(height) {
    Array(width) { mutableSetOf<Element>() }
  }

  private val elementToPosition =
    mutableMapOf<Element, Position>()

  // Functions implementing Maze
  // now directly access 'cells'
}
