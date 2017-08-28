// ListOperations/Reduce.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val terms = listOf(1, 10, 100, 1000)
  terms.reduce {
    sum, n -> sum + n
  } eq 1111

  terms.sum() eq 1111  // [1]
}
