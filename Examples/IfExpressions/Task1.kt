// IfExpressions/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package ifExpressionsExercise1

fun checkSign(number: Int): String =
  if (number > 0)
    "positive"
  else if (number < 0)
    "negative"
  else
    "zero"

fun main() {
  println(checkSign(-19))  // negative
}
