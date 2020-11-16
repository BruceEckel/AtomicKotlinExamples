// OperatorOverloading/Ranges.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

data class R(val r: IntRange) { // Range
  override fun toString() = "R($r)"
}

operator fun E.rangeTo(e: E) = R(v..e.v)

operator fun R.contains(e: E): Boolean =
  e.v in r

fun main() {
  val a = E(2)
  val b = E(3)
  val r = a..b        // a.rangeTo(b)
  (a in r) eq true    // r.contains(a)
  (a !in r) eq false  // !r.contains(a)
  r eq R(2..3)
}
