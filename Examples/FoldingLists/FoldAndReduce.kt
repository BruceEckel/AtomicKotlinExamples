// FoldingLists/FoldAndReduce.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  list.fold(1) { acc, elem -> acc * elem } eq
    1 * 1 * 2 * 3 * 4

  list.reduce { acc, elem -> acc * elem } eq
    1 * 2 * 3 * 4
}
