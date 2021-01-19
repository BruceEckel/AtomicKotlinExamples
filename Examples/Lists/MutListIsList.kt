// Lists/MutListIsList.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package lists
import atomictest.eq

fun getList(): List<Int> {
  return mutableListOf(1, 2, 3)
}

fun main() {
  // getList() produces a read-only List:
  val list = getList()
  // list += 3 // Error
  list eq listOf(1, 2, 3)
}
