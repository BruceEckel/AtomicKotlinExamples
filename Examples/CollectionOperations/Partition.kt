// CollectionOperations/Partition.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, null)
  list.filterNotNull() eq "[1, 2]"
}
