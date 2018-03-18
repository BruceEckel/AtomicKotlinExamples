// Lists/MutListIsList.kt
import atomictest.eq

fun getList(): List<Int> {
  return mutableListOf(1, 2, 3)
}

fun main(args: Array<String>) {
  // getList() produces a read-only List:
  val list = getList()
  // list += 3 // Error
  list eq listOf(1, 2, 3)
}
