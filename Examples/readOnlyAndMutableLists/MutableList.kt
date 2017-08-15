// readOnlyAndMutableLists/MutableList.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val list: MutableList<Int> = mutableListOf(1, 2)

  list.add(3)
  list.addAll(listOf(4, 5))

  list += 6
  list += listOf(7, 8)

  list eq listOf(1, 2, 3, 4, 5, 6, 7, 8)
}
