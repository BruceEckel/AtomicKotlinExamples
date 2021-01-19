// Exceptions/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package exceptionsExercise4

fun foo() {
  throw IllegalStateException("something is wrong")
}

fun bar() {
  foo()
}

fun main() {
  // bar() // Uncomment this to see exception
}
