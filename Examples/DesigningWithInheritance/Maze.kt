// DesigningWithInheritance/Maze.kt
package designingwithinheritance.maze

interface GameElement
interface Move
class Robot : GameElement
data class Position(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<GameElement>
  fun allAt(p: Position): Set<GameElement>
  fun position(e: GameElement): Position?
  fun add(e: GameElement, p: Position)
  fun remove(e: GameElement)
}

interface Game {
  val maze: Maze
  // other members
}

fun playGame(game: Game) {
  val position = Position(0, 0)
  game.maze.allAt(position).forEach {
    game.maze.remove(it)    // [1]
  }
}
