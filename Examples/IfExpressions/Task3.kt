// IfExpressions/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package ifExpressionsExercise3

fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  println(findMax(-1, 4))  // 4
}
