// NestedClasses/NestedEx1.kt
package nestedclassesex1
import atomictest.*
import nestedclassesex1.Game.Mark.*
import java.lang.IllegalStateException
import kotlin.random.Random

interface Game {
  enum class Mark { BLANK, X, Y, Z }
}

class FillIt(
  val side: Int = 3, randomSeed: Int = 0
) : Game {
  val rand = Random(randomSeed)
  private var grid =
    MutableList(side * side) { BLANK }
  private var player = X
  fun turn(): Boolean {
    val blanks = grid.withIndex()
      .filter { it.value == BLANK }
    if (blanks.isEmpty())
      return false
    grid[blanks.random(rand).index] = player
    player = when(player) {
      BLANK -> throw IllegalStateException()
      X -> Y
      Y -> Z
      Z -> X
    }
    return true
  }
  fun play() {
    while(turn())
      ;
  }
  override fun toString() =
    grid.chunked(side).joinToString("\n")
}

fun main() {
  val game = FillIt(8, 17)
  game.play()
  game eq """
  [X, Z, Y, Z, Z, Y, X, Y]
  [Y, Z, Z, Y, Z, Y, Y, Z]
  [Z, Y, Z, Y, Y, X, X, Y]
  [X, X, X, Y, Y, X, X, Y]
  [X, X, Z, X, Z, X, X, X]
  [Z, X, Z, X, Y, Z, Z, Z]
  [Y, Y, X, Y, Z, Z, Z, X]
  [Y, X, Z, Y, Y, X, X, Z]
  """.trimIndent()
}
