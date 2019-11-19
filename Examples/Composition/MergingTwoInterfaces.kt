// Composition/MergingTwoInterfaces.kt
package gamecomposition3

interface GameElement
interface Move
data class Position(val x: Int, val y: Int)

interface Game {
  // maze members
  fun all(): Set<GameElement>
  fun allAt(p: Position): Set<GameElement>
  fun position(e: GameElement): Position?
  fun add(e: GameElement, p: Position)
  fun remove(e: GameElement)

  // game members
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}
