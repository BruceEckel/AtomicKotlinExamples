// SealedClasses/Matching.kt
package sealedclasses.mathing

interface GameElement
interface Position

sealed class GameAction

data class DestroyAction(
  val element: GameElement
) : GameAction()

data class MoveAction(
  val element: GameElement,
  val newPosition: Position
) : GameAction()

interface MutableMaze {
  fun add(element: GameElement, position: Position)
  fun remove(element: GameElement)
}

class Game1(val maze: MutableMaze) {
  fun applyActions(
    actions: Collection<GameAction>
  ) {
    for(action in actions) {
      when (action) {
        is DestroyAction ->
          maze.remove(action.element)
        is MoveAction -> {
          maze.remove(action.element)
          maze.add(action.element,
            action.newPosition)
        }
      }
    }
  }
}
