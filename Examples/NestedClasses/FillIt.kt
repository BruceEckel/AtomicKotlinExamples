// NestedClasses/FillIt.kt
package nestedclasses
import nestedclasses.GridGame.State.*
import nestedclasses.GridGame.Mark.*
import kotlin.random.Random
import atomictest.*

interface GridGame {
  enum class State { PLAYING, FINISHED }
  enum class Mark { BLANK, X ,O }
}

class FillIt(
  val side: Int = 3, randomSeed: Int = 0
) : GridGame {
  val rand = Random(randomSeed)
  private var state = PLAYING
  private var grid =
    MutableList(side * side) { BLANK }
  private var player = X
  fun turn() {
    val blanks = grid.withIndex()
      .filter { it.value == BLANK }
    if(blanks.isEmpty()) {
      state = FINISHED
    } else {
      grid[blanks.random(rand).index] = player
      player = if (player == X) O else X
    }
  }
  fun play() {
    while(state != FINISHED)
      turn()
  }
  override fun toString() =
    grid.chunked(side).joinToString("\n")
}

fun main() {
  val game = FillIt(8, 17)
  game.play()
  Trace(game) eq """
  [O, X, O, X, O, X, X, X]
  [X, O, O, O, O, O, X, X]
  [O, O, X, O, O, O, X, X]
  [X, O, O, O, O, O, X, O]
  [X, X, O, O, X, X, X, O]
  [X, X, O, O, X, X, O, X]
  [O, X, X, O, O, O, X, O]
  [X, O, X, X, X, O, X, X]
  """
}
