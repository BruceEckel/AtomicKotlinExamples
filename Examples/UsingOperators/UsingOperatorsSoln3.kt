// UsingOperators/UsingOperatorsSoln3.kt
package usingoperatorssoln3
import kotlin.random.Random

data class N(var n: Int) : Comparable<N> {
  override fun compareTo(other: N) =
    n.compareTo(other.n)
  override fun toString() = "N($n)"
}

fun main() {
  val rnd = Random(47) // For repeatability
  val key = N(11)
  val map = mutableMapOf(Pair(key, 47))
  println(map[key])
  key.n++
  println(map[key])
  val list = List(5) { N(it) }.shuffled(rnd)
  println("list: $list")
  val set = list.toSortedSet()
  println("sorted set (1): $set")
  set.min()!!.n += 2
  println("sorted set (2): $set")
}
/* Exercise Output:
47
null
list: [N(4), N(0), N(2), N(3), N(1)]
sorted set (1): [N(0), N(1), N(2), N(3), N(4)]
sorted set (2): [N(2), N(1), N(2), N(3), N(4)]
*/
