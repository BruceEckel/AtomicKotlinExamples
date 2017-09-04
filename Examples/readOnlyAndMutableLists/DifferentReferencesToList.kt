// ReadOnlyAndMutableLists/DifferentReferencesToList.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list1 = mutableListOf(1)
  val list2: List<Int> = list1
  list2 eq listOf(1)

  list1 += 2
  // list2 sees the change:
  list2 eq listOf(1, 2)
}
