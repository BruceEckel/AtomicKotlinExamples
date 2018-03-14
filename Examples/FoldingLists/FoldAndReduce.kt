// FoldingLists/FoldAndReduce.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)
  list.fold(1) { acc, elem -> acc * elem } eq
    1 * 1 * 2 * 3 * 4

  list.reduce { acc, elem -> acc * elem } eq
    1 * 2 * 3 * 4
}
