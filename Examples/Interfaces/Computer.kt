// Interfaces/Computer.kt
package interfaces
import atomictest.*

interface Computer {
  fun calculateAnswer(): Int
}

class DeepThought : Computer {
  override fun calculateAnswer() = 42
}

class BrokenComputer : Computer {
  override fun calculateAnswer() =
    throw IllegalStateException("No answer")
}

fun main() {
  val deepThought = DeepThought()
  deepThought.calculateAnswer() eq 42
  capture {
    BrokenComputer().calculateAnswer()
  } eq "IllegalStateException: No answer"
}
