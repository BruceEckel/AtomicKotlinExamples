// Composition/PreferComposition.kt
package prefercomposition

interface Element
class Position

interface ElementMatrix { /* ... */ }

class ElementMatrixImpl(
  width: Int, height: Int
) : ElementMatrix {

  private val cells = Array(height) {
    Array(width) { mutableSetOf<Element>() }
  }
  // Functions implementing ElementMatrix
}

interface Maze { /* ... */ }

class MazeImpl(
  val representation: String,
  val width: Int,
  val height: Int
): Maze {

  private val matrix: ElementMatrix =
    ElementMatrixImpl(width, height)

  private val elementToPosition =
    mutableMapOf<Element, Position>()

  // Functions implementing Maze
}
