// Inheritance/MazeGameInheritance.kt
package inheritance

interface Cell

interface Maze {
  fun all(): Set<GameElement>

  fun allIn(cell: Cell): Set<GameElement>

  fun cell(element: GameElement): Cell?

  fun add(element: GameElement, cell: Cell)

  fun remove(element: GameElement)
}

interface GameElement {
  fun play(maze: Maze)
}

open class StaticElement : GameElement {
  override fun play(maze: Maze) {
    // Default implementation: do nothing
  }
}

class Wall : StaticElement()  // [1]

class Food : StaticElement()  // [2]

class Bomb : StaticElement() {
  override fun play(maze: Maze) {
    val cell = maze.cell(this) ?: return
    val all = maze.allIn(cell)
    if (all.size > 1) {       // [3]
      all.forEach {           // [4]
        maze.remove(it)
      }
    }
  }
}
