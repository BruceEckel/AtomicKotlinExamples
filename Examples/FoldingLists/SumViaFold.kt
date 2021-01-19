// FoldingLists/SumViaFold.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 10, 100, 1000)
  list.fold(0) { sum, n ->
    sum + n
  } eq 1111
}
