// Recursion/RecursionLimits.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package recursion
import atomictest.eq

fun sum(n: Long): Long {
  if (n == 0L) return 0
  return n + sum(n - 1)
}

fun main() {
  sum(2) eq 3
  sum(1000) eq 500500
  // sum(100_000) eq 500050000       // [1]
  (1..100_000L).sum() eq 5000050000  // [2]
}
