// Interfaces/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interfacesExercise1
import atomictest.eq

interface Computer {
  fun calculateAnswer(): Int
}

class Cloud(n: Int) : Computer {
  val list: List<Node> = List(n) { Node(it) }
  override fun calculateAnswer(): Int {
    return list.sumOf { it.calculateAnswer() }
  }
}

class Node(
  private val result: Int
) : Computer {
  override fun calculateAnswer() = result
}

fun main() {
  Cloud(10).calculateAnswer() eq 45
}
