// Abstract/MobileElement.kt
package abstractclasses
import atomictest.eq

enum class Move {
  UP, RIGHT, DOWN, LEFT, WAIT
}

abstract class MobileElement : GameElement {
  override val sharesCell: Boolean
    get() = true

  abstract fun move(             // [1]
    move: Move, maze: Maze): Cell?
}

class Robot : MobileElement() {
  override val symbol: Char get() = 'R'
  override fun play(maze: Maze) {
    // Eat food
  }

  override fun move(             // [2]
    move: Move, maze: Maze
  ): Cell? {
    // Return new cell
    return null
  }
}

fun main() {
  val robot = Robot()
  robot.symbol eq 'R'
  robot.sharesCell eq true
}
