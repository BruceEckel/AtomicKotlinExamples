// FunctionTypes/AnyFunImplementation.kt
import atomictest.eq

fun <T> List<T>.any(                    // [1]
  predicate: (T) -> Boolean             // [2]
): Boolean {
  for(element in this) {
    if (predicate(element))             // [3]
      return true
  }
  return false
}

fun main() {
  val ints = listOf(1, 2, -3)
  ints.any { it > 0 } eq true           // [4]

  val strings = listOf("abc", " ")
  strings.any { it.isBlank() } eq true  // [5]
  strings.any { it.isBlank() } eq true  // [5]

  strings.any(String::isNotBlank) eq    // [6]
    true
}
