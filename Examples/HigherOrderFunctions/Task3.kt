// HigherOrderFunctions/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package higherOrderFunctionsExercise3
import atomictest.eq

fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
  transform: (Int, T) -> R?
): List<R> {
  val result = mutableListOf<R>()
  for ((index, e) in withIndex()) {
    val transformed = transform(index, e)
    if (transformed != null) {
      result += transformed
    }
  }
  return result
}

fun main() {
  val list = listOf("a", "b", "c", "d")
  list.mapIndexedNotNull { index, s ->
    if (index % 2 == 0) "$s!" else null
  } eq listOf("a!", "c!")
}
