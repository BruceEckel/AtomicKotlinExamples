// Interfaces/RobotEatsFood.kt
package game

class Robot: GameElement {
  private var eatenFoodItems: Int = 0

  override fun playTurn(maze: Maze) {
    val position = maze.position(this)
        ?: return
    val cellElements = maze.allAt(position)
    cellElements
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.remove(food)
      }
  }
}

class Food: GameElement {
  override fun playTurn(maze: Maze) {
    // Do nothing
  }
}
