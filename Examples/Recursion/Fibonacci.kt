// Recursion/Fibonacci.kt
package recursion
import bigint.*
import atomictest.*

tailrec fun fibonacci(n: Int,
  current: BigInt = zero,
  next: BigInt = one): BigInt {
  if(n == 0)
    return current
  return fibonacci(
    n - 1, next, current + next)
}

fun main(args: Array<String>) {
  (0..7).map { fibonacci(it) } eq
  "[0, 1, 1, 2, 3, 5, 8, 13]"
  fibonacci(22) eq 17711.big
  fibonacci(100) eq
  "354224848179261915075".big
}
