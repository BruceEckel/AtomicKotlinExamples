// Composition/InheritanceEffects.kt
package gamecomposition2

interface GameElement
interface Move
data class Cell(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<GameElement>
  fun allIn(c: Cell): Set<GameElement>
  fun cell(e: GameElement): Cell?
  fun add(e: GameElement, c: Cell)
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
  val cell = Cell(0, 0)
  game.allIn(cell).forEach {
    game.remove(it)        // [1]
  }
}
