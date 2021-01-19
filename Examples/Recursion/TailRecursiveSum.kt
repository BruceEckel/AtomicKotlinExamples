// Recursion/TailRecursiveSum.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package tailrecursion
import atomictest.eq

private tailrec fun sum(
  n: Long,
  accumulator: Long
): Long =
  if (n == 0L) accumulator
  else sum(n - 1, accumulator + n)

fun sum(n: Long) = sum(n, 0)

fun main() {
  sum(2) eq 3
  sum(10000) eq 50005000
  sum(100000) eq 5000050000
}
