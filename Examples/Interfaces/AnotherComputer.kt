// Interfaces/AnotherComputer.kt
package interfaces
import atomictest.*

class AnotherComputer: SuperComputer {
  override fun calculateAnswer() =
    throw IllegalStateException("No answer")
}

fun main() {
  capture {
    AnotherComputer().calculateAnswer()
  } eq "IllegalStateException: No answer"
}
