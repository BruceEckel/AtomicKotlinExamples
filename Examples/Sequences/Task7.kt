// Sequences/Task7.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
  return generateSequence(3) { it + 2 }
    .filter { '1' !in it.toString() }
}

fun main() {
  println(oddWithoutDigitOne().take(20).sum())
}
