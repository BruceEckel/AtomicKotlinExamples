// Upcasting/AssigningToVariable.kt
package upcasting

fun main() {
  val element: GameElement = Robot()
  // Doesnt' compile:
  // element.makeMove(Move.RIGHT)
}
