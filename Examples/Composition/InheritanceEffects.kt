// Composition/InheritanceEffects.kt
package gamecomposition2

interface GameElement
interface Move
data class Position(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<GameElement>
  fun allAt(p: Position): Set<GameElement>
  fun position(e: GameElement): Position?
  fun add(e: GameElement, position: Position)
  fun remove(e: GameElement)
}

interface Game : Maze {
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}

fun playGame(game: Game) {
  val position = Position(0, 0)
  game.allAt(position).forEach {
    game.remove(it)        // [1]
  }
}
