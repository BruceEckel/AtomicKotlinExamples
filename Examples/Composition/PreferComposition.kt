// Composition/PreferComposition.kt
package prefercomposition

interface Element
class Position

interface GameMatrix { /* ... */ }

class GameMatrixImpl(
  width: Int, height: Int
) : GameMatrix {

  private val cells = Array(height) {
    Array(width) { mutableSetOf<Element>() }
  }
  // Functions implementing GameMatrix
}

interface Maze { /* ... */ }

class MazeImpl(
  val representation: String,
  val width: Int,
  val height: Int
): Maze {

  private val matrix: GameMatrix =
    GameMatrixImpl(width, height)

  private val elementToPosition =
    mutableMapOf<Element, Position>()

  // Functions implementing Maze
}
