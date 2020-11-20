// Booleans/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package booleansExercise3

fun and(b1: Boolean, b2: Boolean): Boolean =
  if (b1) b2 else false

fun or(b1: Boolean, b2: Boolean): Boolean =
  if (b1) true else b2

fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}
