// Coroutines/CompareSlowFib.kt
import kotlinx.coroutines.experimental.*
import kotlin.system.measureTimeMillis
import bigint.*

// Slow Fibonacci function:
fun fibs(n: BigInt): BigInt {
  assert(n >= zero)
  return when(n) {
    zero -> zero
    one -> one
    else -> fibs(n - one) + fibs(n - two)
  }
}

fun sequentialFibs(): Double {
  val results = Array<BigInt>(3, { zero })
  return measureTimeMillis {
    results[0] = fibs(36.big)
    results[1] = fibs(37.big)
    results[2] = fibs(38.big)
  }.toDouble()
}

fun parallelFibs() = runBlocking<Double> {
  val results = Array<BigInt>(3, { zero })
  measureTimeMillis {
    val a = launch {
      results[0] = fibs(36.big)
    }
    val b = launch {
      results[1] = fibs(37.big)
    }
    val c = launch {
      results[2] = fibs(38.big)
    }
    a.join()
    b.join()
    c.join()
  }.toDouble()
}

fun main(args: Array<String>) {
  val seq = sequentialFibs()
  val par = parallelFibs()
  println("Ratio: ${round2dp(seq/par)}")
}
/* Sample output: (2 core machine)
Ratio: 1.5
*/
