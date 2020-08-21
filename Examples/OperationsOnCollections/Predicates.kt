// OperationsOnCollections/Predicates.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(-3, -1, 5, 7, 10)

  list.filter { it > 0 } eq listOf(5, 7, 10)
  list.count { it > 0 } eq 3

  list.find { it > 0 } eq 5
  list.firstOrNull { it > 0 } eq 5
  list.lastOrNull { it < 0 } eq -1

  list.any { it > 0 } eq true
  list.any { it != 0 } eq true

  list.all { it > 0 } eq false
  list.all { it != 0 } eq true

  list.none { it > 0 } eq false
  list.none { it == 0 } eq true
}
