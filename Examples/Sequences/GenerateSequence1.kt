// Sequences/GenerateSequence1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val inputs = mutableListOf(
    "first", "second", "third", "XXX", "4th")
  val items = generateSequence {
    val input = inputs.removeAt(0)
    if (input != "XXX") input else null
  }
  items.toList() eq "[first, second, third]"
  capture {
    items.toList()
  } eq "IllegalStateException: This " +
    "sequence can be consumed only once."
}
