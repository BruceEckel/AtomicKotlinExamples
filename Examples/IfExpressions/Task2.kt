// IfExpressions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package ifExpressionsExercise2

fun abs(number: Int): Int =
  if (number > 0) number else -number

fun main() {
  println(abs(-19))  // 19
}
