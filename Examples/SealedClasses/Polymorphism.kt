// SealedClasses/Polymorphism.kt
package sealedclasses.polymorphism

interface GameElement
interface Position

interface MutableMaze {
  fun add(e: GameElement, p: Position)
  fun remove(e: GameElement)
}

interface GameAction {
  fun applyTo(maze: MutableMaze)
}

class DestroyAction(
  val element: GameElement
) : GameAction {
  override fun applyTo(maze: MutableMaze) {
    maze.remove(element)
  }
}

class MoveAction(
  val element: GameElement,
  val newPosition: Position
) : GameAction {
  override fun applyTo(maze: MutableMaze) {
    maze.remove(element)
    maze.add(element, newPosition)
  }
}

class Game2(val maze: MutableMaze) {
  fun applyActions(
    actions: Collection<GameAction>
  ) {
    for (action in actions) {
      action.applyTo(maze)
    }
  }
}
