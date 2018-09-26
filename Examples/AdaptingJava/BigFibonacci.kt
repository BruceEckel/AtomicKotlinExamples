// AdaptingJava/BigFibonacci.kt
package adaptingjava
import atomictest.eq
import bigint.*

fun fibonacci(n: Int): BigInt {
  tailrec fun fibonacci(
    n: Int,
    current: BigInt,
    next: BigInt
  ): BigInt {
    if (n == 0) return current
    return fibonacci(
      n - 1, next, current + next)
  }
  return fibonacci(n, zero, one)
}

fun main() {
  (0..7).map { fibonacci(it) } eq
  "[0, 1, 1, 2, 3, 5, 8, 13]"
  fibonacci(22) eq 17711.big
  fibonacci(150) eq
    "9969216677189303386214405760200".big
}
