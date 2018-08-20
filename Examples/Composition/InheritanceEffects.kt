// Composition/InheritanceEffects.kt
package inheritanceeffects

interface Element
data class Position(val x: Int, val y: Int)

interface GameMatrix {
  fun add(e: Element, p: Position)
  fun remove(e: Element, p: Position)
  fun allAt(p: Position): Set<Element>
}

interface Maze : GameMatrix {
  fun move(e: Element, p: Position)
  fun destroy(e: Element)
  fun position(e: Element): Position?
  fun all(): Set<Element>
  override fun allAt(
    p: Position) : Set<Element>
}

fun useMaze(maze: Maze) {
  val position = Position(0, 0)
  maze.allAt(position).forEach {
    maze.remove(it, position)    // [1]
  }
}
