// Recursion/Fibo.kt
import bigint.*
import atomictest.*

fun fibo(n: BigInt): BigInt {
  assert(n >= zero)
  return when(n) {
    zero -> zero
    one -> one
    else -> fibo(n - one) + fibo(n - two)
  }
}

fun main(args: Array<String>) {
  fibo(0.big) eq 0.big
  fibo(22.big) eq 17711.big
  // Very time-consuming:
  // fibo(100.big) eq
  //  "354224848179261915075".big
}
