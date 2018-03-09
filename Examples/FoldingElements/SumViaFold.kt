// FoldingElements/SumViaFold.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 10, 100, 1000)
  list.fold(0) {
    sum, n -> sum + n
  } eq 1111
}
