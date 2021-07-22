// Summary1/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise3

fun first(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) b && c else false

fun second(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) true else b || c

fun main() {
  println(first(true, true, true))
  println(first(true, false, true))

  println(second(false, false, false))
  println(second(false, true, false))
}
/* Output:
true
false
false
true
*/
