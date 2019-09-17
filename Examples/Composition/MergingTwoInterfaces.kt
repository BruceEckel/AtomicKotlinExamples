// Composition/MergingTwoInterfaces.kt
package gamecomposition3

interface Element
interface Move
data class Position(val x: Int, val y: Int)

interface Game {
  // maze members
  fun all(): Set<Element>
  fun allAt(position: Position): Set<Element>
  fun position(element: Element): Position?
  fun add(element: Element, position: Position)
  fun remove(element: Element)

  // game members
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}
