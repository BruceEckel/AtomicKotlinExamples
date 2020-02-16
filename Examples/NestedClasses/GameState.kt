// NestedClasses/GameState.kt
package nestedclasses
import nestedclasses.Game.State.*
import nestedclasses.Game.Mark.*

interface Game {
  enum class State(val active: Boolean) {
    PLAYING(true),
    WON(false),
    LOST(false)
  }
  enum class Mark { X, O }
}

class TicTacToe : Game {
  private var state = PLAYING
  var grid = mapOf()
}

fun main() {

}
