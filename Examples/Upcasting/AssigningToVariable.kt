// Upcasting/AssigningToVariable.kt
package upcasting

fun main() {
  val element: GameElement = Robot()
  // Doesn't compile:
  // element.move(Move.RIGHT)
}
