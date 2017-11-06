// Coroutines/FibonacciSequence.kt
import kotlin.coroutines.experimental.*
import bigint.*
import atomictest.eq

fun main(args: Array<String>) {
  val fibonacciSeq = buildSequence {
    var fibn = Pair(zero, one)
    while(true) {
      yield(fibn.first)
      fibn = Pair(fibn.second,
        fibn.first + fibn.second)
    }
  }
  fibonacciSeq.take(101).last() eq
  "354224848179261915075".big
}
