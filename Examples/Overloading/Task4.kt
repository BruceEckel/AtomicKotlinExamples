// Overloading/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package overloadingExercise4
import atomictest.eq

fun f(n: Int = 0) = n + 373

fun main() {
  f() eq 373
}
