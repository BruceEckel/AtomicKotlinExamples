// Sequences/NumberSequence2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  generateSequence(6) {
    (it - 1).takeIf { it > 0 }
  }.toList() eq listOf(6, 5, 4, 3, 2, 1)
}
