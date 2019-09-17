// SealedClasses/Polymorphism.kt
package sealedclasses.polymorphism

interface GameElement
interface Position

interface MutableMaze {
  fun add(element: GameElement, position: Position)
  fun remove(element: GameElement)
}

interface GameAction {
  fun apply(maze: MutableMaze)
}

class DestroyAction(
  val element: GameElement
) : GameAction {
  override fun apply(maze: MutableMaze) {
    maze.remove(element)
  }
}

class MoveAction(
  val element: GameElement,
  val newPosition: Position
) : GameAction {
  override fun apply(maze: MutableMaze) {
    maze.remove(element)
    maze.add(element, newPosition)
  }  
}

class Game2(val maze: MutableMaze) {
  fun applyActions(
    actions: Collection<GameAction>
  ) {
    for (action in actions) {
      action.apply(maze)
    }
  }
}
