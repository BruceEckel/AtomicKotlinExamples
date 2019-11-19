// Composition/MazeComposition.kt
package prefercomposition

interface GameElement
interface Move
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
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}
