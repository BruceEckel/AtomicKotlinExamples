// DesigningWithInheritance/GameActions.kt
package designingwithinheritance.actions

interface Maze

interface GameAction

data class DestroyAction(
  val element: GameElement
) : GameAction

interface GameElement {
  fun play(maze: Maze): Set<GameAction>
}
