// Abstract/MobileElement.kt
package gameelements

abstract class MobileElement : GameElement {
  override val mobile: Boolean
    get() = true
  abstract fun move(                 // [1]
    currentPosition: Position,
    maze: Maze
  ): Position
}

class Robot : MobileElement() {
  override val symbol: Char get() = 'R'
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Eat food
  }
  override fun move(                  // [2]
    currentPosition: Position,
    maze: Maze
  ): Position {
    // Update position
    return currentPosition
  }
}
