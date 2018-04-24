// TailRecursion/RecursionConstraints.kt
package recursion
import atomictest.eq

fun sum(n: Long): Long {
  if (n == 0L) return 0
  return n + sum(n - 1)
}

fun main(args: Array<String>) {
  sum(2) eq 3
  sum(1000) eq 500500

  // Uncomment this line to get an exception:
  // sum(100000) eq 500050000          // [1]

  // For comparison:
  (1..100000L).sum() eq 5000050000     // [2]
}
