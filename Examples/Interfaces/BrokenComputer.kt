// Interfaces/BrokenComputer.kt
package interfaces
import atomictest.*

class BrokenComputer : SuperComputer {
  override fun calculateAnswer() =
    throw IllegalStateException("No answer")
}

fun main() {
  capture {
    BrokenComputer().calculateAnswer()
  } eq "IllegalStateException: No answer"
}
