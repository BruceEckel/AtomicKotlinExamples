// Recursion/Iteration.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package iteration
import atomictest.eq

fun sum(n: Long): Long {
  var accumulator = 0L
  for (i in 1..n) {
    accumulator += i
  }
  return accumulator
}

fun main() {
  sum(10000) eq 50005000
  sum(100000) eq 5000050000
}
