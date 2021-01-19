// Inheritance/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package inheritanceExercise3
import atomictest.eq

open class Game {
  val initOrder = mutableListOf<String>()
  init {
    initOrder += "Game"
  }
}

open class BoardGame: Game() {
  init {
    initOrder += "BoardGame"
  }
}

class Chess: BoardGame() {
  init {
    initOrder += "Chess"
  }
}

fun main() {
  Chess().initOrder eq "[Game, BoardGame, Chess]"
}
