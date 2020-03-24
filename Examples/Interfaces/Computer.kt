// Interfaces/Computer.kt
package interfaces
import atomictest.*

interface Computer {
  fun prompt(): String
  fun calculateAnswer(): Int
}

class Desktop : Computer {
  override fun prompt() = "Hello!"
  override fun calculateAnswer() = 11
}

class DeepThought : Computer {
  override fun prompt() = "Thinking..."
  override fun calculateAnswer() = 42
}

class Quantum : Computer {
  override fun prompt() = "Probably..."
  override fun calculateAnswer() = -1
}

fun main() {
  Desktop().calculateAnswer() eq 11
  DeepThought().calculateAnswer() eq 42
  Quantum().calculateAnswer() eq -1
}
