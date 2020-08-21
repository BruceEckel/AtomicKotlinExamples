// OperationsOnCollections/Partition.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(-3, -1, 5, 7, 10)
  val isPositive = { i: Int -> i > 0 }

  list.filter(isPositive) eq "[5, 7, 10]"
  list.filterNot(isPositive) eq "[-3, -1]"

  val (pos, neg) = list.partition { it > 0 }
  pos eq "[5, 7, 10]"
  neg eq "[-3, -1]"
}
