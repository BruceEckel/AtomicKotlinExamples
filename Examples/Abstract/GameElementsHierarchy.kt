// Abstract/GameElementsHierarchy.kt
package abstractclasses

import atomictest.eq

interface Maze
interface Cell

interface GameElement {
  val symbol: Char
  val sharesCell: Boolean
  fun play(maze: Maze)
}

abstract class StaticElement(
  override val sharesCell: Boolean    // [1]
) : GameElement {
  override fun play(maze: Maze) {
    // Default implementation: do nothing
  }
}

class Wall :
  StaticElement(sharesCell = false) { // [2]
  override val symbol: Char
    get() = '#'                       // [3]
}

fun main() {
  val wall = Wall()
  wall.symbol eq '#'
  wall.sharesCell eq false
}
