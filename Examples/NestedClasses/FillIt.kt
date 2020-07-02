// NestedClasses/FillIt.kt
package nestedclasses
import nestedclasses.Game.State.*
import nestedclasses.Game.Mark.*
import kotlin.random.Random
import atomictest.*

interface Game {
  enum class State { Playing, Finished }
  enum class Mark { Blank, X ,O }
}

class FillIt(
  val side: Int = 3, randomSeed: Int = 0
): Game {
  val rand = Random(randomSeed)
  private var state = Playing
  private val grid =
    MutableList(side * side) { Blank }
  private var player = X
  fun turn() {
    val blanks = grid.withIndex()
      .filter { it.value == Blank }
    if(blanks.isEmpty()) {
      state = Finished
    } else {
      grid[blanks.random(rand).index] = player
      player = if (player == X) O else X
    }
  }
  fun play() {
    while(state != Finished)
      turn()
  }
  override fun toString() =
    grid.chunked(side).joinToString("\n")
}

fun main() {
  val game = FillIt(8, 17)
  game.play()
  game eq """
  [O, X, O, X, O, X, X, X]
  [X, O, O, O, O, O, X, X]
  [O, O, X, O, O, O, X, X]
  [X, O, O, O, O, O, X, O]
  [X, X, O, O, X, X, X, O]
  [X, X, O, O, X, X, O, X]
  [O, X, X, O, O, O, X, O]
  [X, O, X, X, X, O, X, X]
  """.trimIndent()
}
