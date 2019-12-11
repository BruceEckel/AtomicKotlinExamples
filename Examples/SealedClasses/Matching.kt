// SealedClasses/Matching.kt
package sealedclasses.mathing

interface GameElement
interface Cell

sealed class GameAction

data class DestroyAction(
  val element: GameElement
) : GameAction()

data class MoveAction(
  val element: GameElement,
  val newCell: Cell
) : GameAction()

interface MutableMaze {
  fun add(e: GameElement, c: Cell)
  fun remove(e: GameElement)
}

class Game1(val maze: MutableMaze) {
  fun applyActions(
    actions: Collection<GameAction>
  ) {
    for (action in actions) {
      when (action) {
        is DestroyAction ->
          maze.remove(action.element)
        is MoveAction -> {
          maze.remove(action.element)
          maze.add(action.element,
            action.newCell)
        }
      }
    }
  }
}
