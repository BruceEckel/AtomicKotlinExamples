// Booleans/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
  println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
  println("$first || $second == ${first || second}")
}

fun showTruthTable() {
  showAnd(true, true)
  showAnd(true, false)
  showAnd(false, true)
  showAnd(false, false)

  showOr(true, true)
  showOr(true, false)
  showOr(false, true)
  showOr(false, false)
}

fun main() {
  showTruthTable()
}
