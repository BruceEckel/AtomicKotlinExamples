// NonNullAssertions/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nonNullAssertionsExercise3

import atomictest.eq
import kotlin.math.absoluteValue

fun absValueMaxEqualsMin(list: List<Int>): Boolean {
  if (list.isEmpty()) return false
  return list.max()!!.absoluteValue == list.min()!!.absoluteValue
}

fun main() {
  absValueMaxEqualsMin(listOf(-10, 1, 10)) eq true
  absValueMaxEqualsMin(listOf(10, 10)) eq true
  absValueMaxEqualsMin(listOf(-10, 1)) eq false
}
