// Composition/IntroducingGame.kt
package gamecomposition1

enum class Move {
  UP, RIGHT, DOWN, LEFT, WAIT
}

interface Game {
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}
