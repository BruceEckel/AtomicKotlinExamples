// Interfaces/RobotEatsFood.kt
package game

class Robot : GameElement {
  private var eatenFoodItems: Int = 0

  override fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    sameCellElements
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.destroyElement(food)
      }
  }
}

class Food : GameElement {
  override fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Do nothing
  }
}
