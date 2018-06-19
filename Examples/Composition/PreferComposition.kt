// Composition/PreferComposition.kt
package prefercomposition

interface Element
class Position

interface ElementsMatrix { /* ... */ }

class ElementsMatrixImpl(
  width: Int, height: Int
) : ElementsMatrix {

  private val cells = Array(height) {
    Array(width) { mutableSetOf<Element>() }
  }
  // Functions implementing ElementsMatrix
}

interface Maze { /* ... */ }

class MazeImpl(
  val representation: String,
  val width: Int,
  val height: Int
): Maze {

  private val matrix: ElementsMatrix =
    ElementsMatrixImpl(width, height)

  private val elementToPosition =
    mutableMapOf<Element, Position>()

  // Functions implementing Maze
}
