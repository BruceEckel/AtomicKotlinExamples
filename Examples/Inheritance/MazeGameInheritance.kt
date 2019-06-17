// Inheritance/MazeGameInheritance.kt

interface Maze {
  // Omitting other members for simplicity
  fun destroy(element: GameElement)
}

interface GameElement {
  fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}

open class StaticElement: GameElement {
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Default implementation: do nothing
  }
}

class Wall: StaticElement()  // [1]

class Food: StaticElement()  // [2]

class Bomb: StaticElement() {
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    if (sameCellElements.isEmpty()) return
    sameCellElements.forEach {    // [3]
      maze.destroy(it)
    }
    maze.destroy(this)    // [4]
  }
}
