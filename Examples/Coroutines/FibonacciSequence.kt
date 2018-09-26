// Coroutines/FibonacciSequence.kt
import atomictest.eq
import bigint.*
import kotlin.coroutines.*

fun main() {
  val fibonacciSeq = sequence {
    var n = Pair(zero, one)
    while (true) {
      yield(n.first)
      n = Pair(n.second, n.first + n.second)
    }
  }
  fibonacciSeq.take(101).last() eq
    "354224848179261915075".big
}
