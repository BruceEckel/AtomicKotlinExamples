// Composition/InheritanceEffects.kt
package gamecomposition2

interface Element
interface Move
data class Position(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<Element>
  fun allAt(position: Position): Set<Element>
  fun position(element: Element): Position?
  fun add(element: Element, position: Position)
  fun remove(element: Element)
}

interface Game: Maze {
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
