// Upcasting/TrimmedMembers.kt
package upcasting

fun play1(gameElement: GameElement) {
  // Doesnt' compile:
  // gameElement.makeMove(Move.RIGHT)   // [1]
}

fun main() {
  play1(Robot())
}
