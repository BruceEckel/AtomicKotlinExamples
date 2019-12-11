// InheritanceAndExtensions/SimpleMaze.kt
package inheritanceAndExtensions

interface GameElement {
  val sharesCell: Boolean
}

data class Cell(val x: Int, val y: Int)

interface Maze {
  val width: Int
  val height: Int
  fun all(): Set<GameElement>
  fun allIn(c: Cell): Set<GameElement>
  fun cell(e: GameElement): Cell?
  fun add(e: GameElement, c: Cell)
  fun remove(e: GameElement)
}

fun Maze.sameCellElements(
  element: GameElement
): Set<GameElement> {
  val cell = cell(element)
    ?: return setOf()
  return allIn(cell) - element
}

fun Maze.isPassable(
  cell: Cell
): Boolean {
  if (cell.x !in (0 until width)
    || cell.y !in (0 until height)) {
    return false
  }
  val cellOccupants = allIn(cell)
  return cellOccupants
    .all { it.sharesCell }
}
