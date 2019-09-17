// DesigningWithInheritance/MutableMaze.kt
package designingwithinheritance

data class Position(val x: Int, val y: Int)

interface Maze {
  // Read-only access operations
  fun all(): Set<GameElement>
  fun allAt(position: Position): Set<GameElement>
}

interface MutableMaze : Maze {
  // Modification Operations 
  fun add(element: GameElement, position: Position)
  fun remove(element: GameElement)
}

// Dummy implementation:
class MazeImpl: MutableMaze {
  override fun all(): Set<GameElement> {
    return setOf() 
  }
  override fun allAt(
      position: Position
  ): Set<GameElement> {
    return setOf() 
  }
  override fun add(
      element: GameElement,
      position: Position
  ) {
    println("Adding $element to $position")
  }
  override fun remove(element: GameElement) {
    println("Removing $element")
  }
}

interface GameElement

class Food : GameElement {
  override fun toString() = "Food"
}

class Robot : GameElement {
  override fun toString() = "Robot"
}

interface Game {
  val maze: Maze
  fun playTurn() 
  // other members
}

class GameImpl: Game {
  override val maze: MutableMaze = MazeImpl() 
  override fun playTurn() {
    // We can access modification members: 
    maze.add(Robot(), Position(0, 0))   // [1]
  }
}

fun main() {
  val game: Game = GameImpl()
  game.playTurn()

  // We can't access modification members:
// game.maze.add(Robot(), Position(0, 0)) // [2]
}
/* Output:
Adding Robot to Position(x=0, y=0)
*/
