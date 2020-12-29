// IfExpressions/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package ifExpressionsExercise4

fun oneOrTheOther(exp: Boolean) =
  if (exp)
    "True!"
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))  // True!
}
