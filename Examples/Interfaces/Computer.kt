// Interfaces/Computer.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
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
  val computers = listOf(
    Desktop(), DeepThought(), Quantum()
  )
  computers.map { it.calculateAnswer() } eq
    "[11, 42, -1]"
  computers.map { it.prompt() } eq
    "[Hello!, Thinking..., Probably...]"
}
