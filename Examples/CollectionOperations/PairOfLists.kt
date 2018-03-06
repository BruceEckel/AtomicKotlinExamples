// CollectionOperations/PairOfLists.kt
package pairs
import atomictest.eq

fun foo() = Pair(1, "one")

fun main(args: Array<String>) {
  val (i, s) = foo()
  i eq 1
  s eq "one"
}
