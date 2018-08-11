// Interfaces/SuperComputer.kt
package interfaces
import atomictest.eq

interface SuperComputer {
  fun calculateAnswer(): Int
}

class DeepThought : SuperComputer {
  override fun calculateAnswer() = 42
}

fun main(args: Array<String>) {
  val deepThought = DeepThought()
  deepThought.calculateAnswer() eq 42
}
