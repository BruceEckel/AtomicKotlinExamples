// Destructuring/Tuple.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package destructuring
import atomictest.eq

data class Tuple(
  val i: Int,
  val d: Double,
  val s: String,
  val b: Boolean,
  val l: List<Int>
)

fun main() {
  val tuple = Tuple(
    1, 3.14, "Mouse", false, listOf())
  val (i, d, s, b, l) = tuple
  i eq 1
  d eq 3.14
  s eq "Mouse"
  b eq false
  l eq listOf()

  val (_, _, animal) = tuple   // [1]
  animal eq "Mouse"
}
