// Coroutines/FibonacciSequence.kt
import kotlin.coroutines.experimental.*
import bigint.*
import atomictest.eq

fun main(args: Array<String>) {
  val fibonacciSeq = buildSequence {
    var n = Pair(zero, one)
    while(true) {
      yield(n.first)
      n = Pair(n.second, n.first + n.second)
    }
  }
  fibonacciSeq.take(101).last() eq
  "354224848179261915075".big
}
