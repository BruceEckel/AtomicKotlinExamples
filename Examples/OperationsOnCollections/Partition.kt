// OperationsOnCollections/Partition.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(-3, -1, 5, 7, 10)
  val isPositive = { i: Int -> i > 0 }

  list.filter(isPositive) eq "[5, 7, 10]"
  list.filterNot(isPositive) eq "[-3, -1]"

  val (pos, neg) = list.partition { it > 0 }
  pos eq "[5, 7, 10]"
  neg eq "[-3, -1]"
}
