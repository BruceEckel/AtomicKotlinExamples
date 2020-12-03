// Testing/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1, 1, 1) eq 3
  sum(1, 2, 3) eq 6
  sum(1, 2, 3) neq 5
  sum(-1, -10, -100) eq -111
  sum(2131, 81783, 16085) eq 99999
}
