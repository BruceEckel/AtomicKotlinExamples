// OperationsOnCollections/PairOfLists.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun createPair() = Pair(1, "one")

fun main() {
  val (i, s) = createPair()
  i eq 1
  s eq "one"
}
