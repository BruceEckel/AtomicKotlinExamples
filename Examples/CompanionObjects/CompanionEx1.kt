// CompanionObjects/CompanionEx1.kt
package companionobjectsex1
import atomictest.*

private val trace = Trace()

interface Game {
  fun move(): Boolean
}

interface GameFactory {
  val game: Game
}

class Checkers private constructor() : Game {
  private var moves = 0
  override fun move(): Boolean {
    trace("Checkers move $moves")
    return ++moves != MOVES
  }
  companion object {
    private const val MOVES = 3
    var factory = object : GameFactory {
      override val game: Game
        get() = Checkers()
    }
  }
}

class Chess private constructor() : Game {
  private var moves = 0
  override fun move(): Boolean {
    trace("Chess move $moves")
    return ++moves != MOVES
  }
  companion object {
    private val MOVES = 4
    var factory = object : GameFactory {
      override val game: Game
        get() = Chess()
    }
  }
}

fun playGame(factory: GameFactory) {
  val s = factory.game
  while (s.move())
  ;
}

fun main() {
  playGame(Checkers.factory)
  playGame(Chess.factory)
}
