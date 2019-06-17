// Interfaces/RobotEatsFood.kt
package game

class Robot: GameElement {
  private var eatenFoodItems: Int = 0
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    sameCellElements
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.destroy(food)
      }
  }
}

class Food: GameElement {
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Do nothing
  }
}
