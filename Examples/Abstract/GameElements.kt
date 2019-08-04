// Abstract/GameElements.kt
package gameelements

interface Maze
interface Position

interface GameElement {
  val symbol: Char
  val sharesCell: Boolean
  fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}

abstract class StaticElement(
  override val sharesCell: Boolean    // [1]
): GameElement {
  override fun interact(
    maze: Maze,
    sameCellElements: Set<GameElement>
  ) {
    // Default: do nothing
  }
}

class Wall:
  StaticElement(sharesCell = false) { // [2]
  override val symbol: Char
    get() = '#'                       // [3]
}
