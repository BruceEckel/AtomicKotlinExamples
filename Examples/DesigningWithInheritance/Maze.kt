// DesigningWithInheritance/Maze.kt
package designingwithinheritance.maze

interface Element
interface Move
class Robot : Element
data class Position(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<Element>
  fun allAt(position: Position): Set<Element>
  fun position(element: Element): Position?
  fun add(element: Element, position: Position)
  fun remove(element: Element)
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
