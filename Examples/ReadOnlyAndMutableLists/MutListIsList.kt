// ReadOnlyAndMutableLists/MutListIsList.kt
package readonlyandmutable
import atomictest.eq

fun getList(): List<Int> {
  return mutableListOf(1, 2, 3)
}

fun main(args: Array<String>) {
  // getList() produces an immutable List:
  val list = getList()
  // list += 3 // Error
  list eq listOf(1, 2, 3)
}
