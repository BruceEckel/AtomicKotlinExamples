// DesigningWithInheritance/Maze.kt
package designingwithinheritance.maze

interface GameElement
interface Move
class Robot : GameElement
data class Cell(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<GameElement>
  fun allIn(c: Cell): Set<GameElement>
  fun cell(e: GameElement): Cell?
  fun add(e: GameElement, c: Cell)
  fun remove(e: GameElement)
}

interface Game {
  val maze: Maze
  // other members
}

fun playGame(game: Game) {
  val cell = Cell(0, 0)
  game.maze.allIn(cell).forEach {
    game.maze.remove(it)    // [1]
  }
}
