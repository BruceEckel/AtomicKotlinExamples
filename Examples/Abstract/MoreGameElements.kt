// Abstract/MoreGameElements.kt
package gameelements

abstract class MovableElement : GameElement {

  override val preventMovement: Boolean
    get() = false

  abstract fun makeMove(                 // [1]
    currentPosition: Position,
    maze: Maze
  ): Position
}

class Robot : MovableElement() {

  override val symbol: Char get() = 'R'

  override fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Eat food
  }

  override fun makeMove(                  // [2]
    currentPosition: Position,
    maze: Maze
  ): Position {
    // Update position
    return currentPosition
  }
}
