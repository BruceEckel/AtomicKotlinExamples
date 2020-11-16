// OperatorOverloading/DefiningEquality.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

class E(var v: Int) {
  override fun equals(other: Any?) = when {
    this === other -> true           // [1]
    other !is E -> false             // [2]
    else -> v == other.v             // [3]
  }
  override fun hashCode(): Int = v
  override fun toString() = "E($v)"
}

fun main() {
  val a = E(1)
  val b = E(2)
  (a == b) eq false   // a.equals(b)
  (a != b) eq true    // !a.equals(b)
  // Reference equality:
  (E(1) === E(1)) eq false
}
