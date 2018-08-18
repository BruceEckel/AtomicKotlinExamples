// Composition/InheritanceEffects.kt
package inheritanceeffects

interface Element
data class Position(val x: Int, val y: Int)

interface ElementMatrix {
  fun addElement(e: Element, p: Position)
  fun removeElement(e: Element, p: Position)
  fun getElements(p: Position): Set<Element>
}

interface Maze : ElementMatrix {
  fun moveElement(e: Element, p: Position)
  fun destroyElement(e: Element)
  fun getPosition(e: Element): Position?
  fun getAllElements(): Set<Element>
  override fun getElements(
      p: Position) : Set<Element>
}

fun useMaze(maze: Maze) {
  val position = Position(0, 0)
  maze.getElements(position).forEach {
    maze.removeElement(it, position)    // [1]
  }
}
