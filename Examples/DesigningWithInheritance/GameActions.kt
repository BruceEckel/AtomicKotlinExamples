// DesigningWithInheritance/GameActions.kt
package designingwithinheritance.actions

interface Maze

interface GameAction

data class DestroyAction(
  val element: GameElement
) : GameAction

interface GameElement {
  fun playTurn(maze: Maze): Set<GameAction>
}
