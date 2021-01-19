// Lists/IntList1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package listsExercise1

class IntList(private val list: List<Int>) : Iterable<Int> {

  override fun iterator(): Iterator<Int> = list.iterator()

  operator fun get(index: Int): Int = list[index]

  override fun toString() = list.toString()

  fun size() = list.size
}
