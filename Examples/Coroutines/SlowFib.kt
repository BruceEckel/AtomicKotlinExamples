// Coroutines/SlowFib.kt
import bigint.*
import kotlin.system.measureTimeMillis

fun fibs(n: BigInt): BigInt {
  assert(n >= zero)
  return when(n) {
    zero -> zero
    one -> one
    else -> fibs(n - one) + fibs(n - two)
  }
}

fun main(args: Array<String>) {
  val results = Array<BigInt>(3, { zero })
  val time = measureTimeMillis {
    results[0] = fibs(36.big)
    results[1] = fibs(37.big)
    results[2] = fibs(38.big)
  }
  println("${results.joinToString()} completed in $time ms")
}
