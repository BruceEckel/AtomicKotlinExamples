// Exceptions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionsExercise2
import atomictest.capture
import atomictest.eq

fun abort(s: String) {
  throw Exception(s)
}

fun main() {
  capture {
    abort("Stop!")
  } eq "Exception: Stop!"
}
