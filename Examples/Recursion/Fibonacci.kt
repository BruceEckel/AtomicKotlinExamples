// Recursion/Fibonacci.kt
package recursion
import atomictest.eq

fun fibonacci(n: Int): Long {
  tailrec fun fibonacci(
    n: Int,
    current: Long,
    next: Long
  ): Long {
    if (n == 0) return current
    return fibonacci(
      n - 1, next, current + next)
  }
  return fibonacci(n, 0L, 1L)
}

fun main(args: Array<String>) {
  (0..8).map { fibonacci(it) } eq
    "[0, 1, 1, 2, 3, 5, 8, 13, 21]"
  fibonacci(22) eq 17711
  fibonacci(50) eq 12586269025
}
