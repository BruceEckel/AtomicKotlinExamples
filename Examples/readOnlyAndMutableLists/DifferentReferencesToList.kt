// readOnlyAndMutableLists/DifferentReferencesToList.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val list1 = mutableListOf(1)
  val list2: List<Int> = list1
  list2 eq listOf(1)

  list1 += 2
  // list2 is changed as well
  list2 eq listOf(1, 2)
}
