// Abstract/GameElements.kt
package gameelements

interface Maze
interface Position

interface GameElement {
  val symbol: Char
  val preventMovement: Boolean

  fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}

abstract class ImmovableElement(
  override val preventMovement: Boolean  // [1]
) : GameElement {

  override fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Default implementation: do nothing
  }
}

class Wall :                             // [2]
  ImmovableElement(preventMovement = true) {

  override val symbol: Char get() = '#'  // [3]
}
