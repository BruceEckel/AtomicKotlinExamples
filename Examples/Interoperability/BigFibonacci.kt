// Interoperability/BigFibonacci.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq
import java.math.BigInteger
import java.math.BigInteger.ONE
import java.math.BigInteger.ZERO

fun fibonacci(n: Int): BigInteger {
  tailrec fun fibonacci(
    n: Int,
    current: BigInteger,
    next: BigInteger
  ): BigInteger {
    if (n == 0) return current
    return fibonacci(
      n - 1, next, current + next)      // [1]
  }
  return fibonacci(n, ZERO, ONE)
}

fun main() {
  (0..7).map { fibonacci(it) } eq
  "[0, 1, 1, 2, 3, 5, 8, 13]"
  fibonacci(22) eq 17711.toBigInteger()
  fibonacci(150) eq
    "9969216677189303386214405760200"
      .toBigInteger()
}
