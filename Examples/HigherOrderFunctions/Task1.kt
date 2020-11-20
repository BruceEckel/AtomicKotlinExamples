// HigherOrderFunctions/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package higherOrderFunctionsExercise1

import atomictest.eq

fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
  val result = mutableListOf<R>()
  for (e in this) {
    result += transform(e)
  }
  return result
}

fun main() {
  val list = listOf(1, 2, 3)
  list.map { "$it!" } eq listOf("1!", "2!", "3!")
}
