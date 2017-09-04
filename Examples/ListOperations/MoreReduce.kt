// ListOperations/MoreReduce.kt
import atomictest.eq

fun main(args: Array<String>) {
  (1..100).reduce {
    sum, n -> sum + n
  } eq 5050
  listOf("D", "u", "c", "k").reduce {
    sum, n -> sum + n
  } eq "Duck"
}
