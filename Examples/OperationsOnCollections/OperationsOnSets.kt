// OperationsOnCollections/OperationsOnSets.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val set = setOf("a", "ab", "ac")
  set.maxBy { it.length }?.length eq 2
  set.filter {
    it.contains('b')
  } eq listOf("ab")
  set.map { it.length } eq listOf(1, 2, 2)
}
