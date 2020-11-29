// Sequences/GenerateSequence2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val inputs = mutableListOf(
    "first", "second", "third", "XXX", "4th")
  val lines = generateSequence {
    inputs.removeAt(0).takeIf { it != "XXX" }
  }
  lines.toList() eq "[first, second, third]"
}
