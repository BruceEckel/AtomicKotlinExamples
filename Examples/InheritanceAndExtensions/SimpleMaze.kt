// InheritanceAndExtensions/SimpleMaze.kt
package inheritanceAndExtensions

interface GameElement {
  val sharesCell: Boolean
}

data class Position(val x: Int, val y: Int)

interface Maze {
  val width: Int
  val height: Int
  fun all(): Set<GameElement>
  fun allAt(p: Position): Set<GameElement>
  fun position(e: GameElement): Position?
  fun add(e: GameElement, p: Position)
  fun remove(e: GameElement)
}

fun Maze.sameCellElements(
  element: GameElement
): Set<GameElement> {
  val position = position(element)
    ?: return setOf()
  return allAt(position) - element
}

fun Maze.isPassable(
  position: Position
): Boolean {
  if (position.x !in (0 until width)
    || position.y !in (0 until height)) {
    return false
  }
  val elementsAtNewPosition = allAt(position)
  return elementsAtNewPosition
    .all { it.sharesCell }
}
