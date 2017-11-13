// Coroutines/ParallelSlowFib.kt
import kotlinx.coroutines.experimental.*
import bigint.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) =
runBlocking<Unit> {
  val results = Array<BigInt>(3, { zero })
  val time = measureTimeMillis {
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
  }
  println(
    "${results.joinToString()} in $time ms")
}
