// NonNullAssertions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nonNullAssertionsExercise2

import atomictest.eq

fun sumFirstAndLast(list: List<Int>): Int =
  when {
    list.isEmpty() -> 0
    list.size == 1 -> list.first()
    else -> list.first() + list.last()
  }

fun main() {
  sumFirstAndLast(listOf()) eq 0
  sumFirstAndLast(listOf(1)) eq 1
  sumFirstAndLast(listOf(1, 2)) eq 3
  sumFirstAndLast(listOf(1, 2, 3)) eq 4
}
