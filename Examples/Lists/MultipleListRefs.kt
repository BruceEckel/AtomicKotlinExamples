// Lists/MultipleListRefs.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val first = mutableListOf(1)
  val second: List<Int> = first
  second eq listOf(1)

  first += 2
  // second sees the change:
  second eq listOf(1, 2)
}
