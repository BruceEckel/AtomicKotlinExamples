// Lists/MutListIsList.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package lists
import atomictest.eq

fun makeList(): List<Int> =
  mutableListOf(1, 2, 3)

fun main() {
  // makeList() produces a read-only List:
  val list = makeList()
  // list.add(3) // Unresolved reference: add
  list eq listOf(1, 2, 3)
}
