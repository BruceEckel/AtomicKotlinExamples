// UsingOperators/UsingOperatorsSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package usingOperatorsExercise3
import atomictest.trace
import kotlin.random.Random

data class N(var n: Int) : Comparable<N> {
  override fun compareTo(other: N) =
    n.compareTo(other.n)
  override fun toString() = "N($n)"
}

fun main() {
  val rnd = Random(47) // For repeatability
  val key = N(11)
  val map = mutableMapOf(key to 47)
  trace(map[key])
  key.n++
  trace(map[key])
  val list = List(5) { N(it) }.shuffled(rnd)
  trace("list: $list")
  val set = list.toSortedSet()
  trace("sorted set (1): $set")
  set.minOrNull()!!.n += 2
  trace("sorted set (2): $set")
  trace eq """
    47
    null
    list: [N(4), N(0), N(2), N(3), N(1)]
    sorted set (1): [N(0), N(1), N(2), N(3), N(4)]
    sorted set (2): [N(2), N(1), N(2), N(3), N(4)]
  """
}
