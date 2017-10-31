// Recursion/Fibonacci.kt
package recursion
import bigint.*
import atomictest.*

tailrec fun fibonacci(n: BigInt,
  current: BigInt = zero,
  next: BigInt = one): BigInt {
  if(n == zero)
    return current
  return fibonacci(
    n - one, next, current + next)
}

fun main(args: Array<String>) {
  (0..7).map { fibonacci(it.big) } eq
  "[0, 1, 1, 2, 3, 5, 8, 13]"
  fibonacci(22.big) eq 17711.big
  fibonacci(100.big) eq
    "354224848179261915075".big
}
