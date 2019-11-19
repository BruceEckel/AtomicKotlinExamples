// Inheritance/MazeGameInheritance.kt
package inheritance

interface Position

interface Maze {
  fun all(): Set<GameElement>

  fun allAt(
    position: Position): Set<GameElement>

  fun position(
    element: GameElement): Position?

  fun add(
    element: GameElement,
    position: Position)

  fun remove(element: GameElement)
}

interface GameElement {
  fun playTurn(maze: Maze)
}

open class StaticElement : GameElement {
  override fun playTurn(maze: Maze) {
    // Default implementation: do nothing
  }
}

class Wall : StaticElement()  // [1]

class Food : StaticElement()  // [2]

class Bomb : StaticElement() {
  override fun playTurn(maze: Maze) {
    val position = maze.position(this)
      ?: return
    val all = maze.allAt(position)
    if (all.size > 1) {       // [3]
      all.forEach {           // [4]
        maze.remove(it)
      }
    }
  }
}
