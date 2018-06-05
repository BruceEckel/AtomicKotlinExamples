// Inheritance/InheritanceInMaze.kt

interface Maze {
  // For simplicity, other members are omitted
  fun destroyElement(element: GameElement)
}

interface GameElement {
  fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}

open class ImmovableElement : GameElement {
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Default implementation: do nothing
  }
}

class Wall : ImmovableElement()  // [1]

class Food : ImmovableElement()  // [2]

class Bomb : ImmovableElement() {
  override fun interact(       // [3]
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    if (sameCellElements.isEmpty()) return
    sameCellElements.forEach {   // [4]
      maze.destroyElement(it)
    }
    maze.destroyElement(this)    // [5]
  }
}
