// Sequences/GenerateSequence2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val items = mutableListOf(
    "first", "second", "third", "XXX", "4th"
  )
  val seq = generateSequence {
    items.removeAt(0).takeIf { it != "XXX" }
  }
  seq.toList() eq "[first, second, third]"
  capture {
    seq.toList()
  } eq "IllegalStateException: This " +
    "sequence can be consumed only once."
}
