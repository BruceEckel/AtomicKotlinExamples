// NullableTypes/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nullableTypesExercise3

import atomictest.eq

fun countHexadecimalNumbers(codes: List<String>): Map<Int, Int> {
  val result = mutableMapOf<Int, Int>()
  for (code in codes) {
    val value = code.toIntOrNull(16)
    if (value != null) {
      val occurrences = result[value]
      result[value] = if (occurrences == null) 1 else occurrences + 1
    }
  }
  return result
}

fun main() {
  countHexadecimalNumbers(listOf(
    "1", "3", "7", "8", "A", "B", "F")) eq
    mapOf(1 to 1, 3 to 1, 7 to 1, 8 to 1, 10 to 1, 11 to 1, 15 to 1)

  countHexadecimalNumbers(listOf("1A", "1A", "1A")) eq
    mapOf(26 to 3)

  countHexadecimalNumbers(listOf("Q")) eq mapOf()
}
