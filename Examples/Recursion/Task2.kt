// Recursion/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package recursionExercise2

import atomictest.eq

fun factorial(n: Long): Long {
  tailrec fun factorial(
    n: Long,
    accumulator: Long
  ): Long =
    if (n == 1L) accumulator
    else factorial(n - 1, accumulator * n)

  return factorial(n, 1)
}

fun main() {
  factorial(3) eq 6
  factorial(4) eq 24
  factorial(11) eq 39916800
}
