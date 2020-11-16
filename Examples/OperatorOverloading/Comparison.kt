// OperatorOverloading/Comparison.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

operator fun E.compareTo(e: E): Int =
  v.compareTo(e.v)

fun main() {
  val a = E(2)
  val b = E(3)
  (a < b) eq true     // a.compareTo(b) < 0
  (a > b) eq false    // a.compareTo(b) > 0
  (a <= b) eq true    // a.compareTo(b) <= 0
  (a >= b) eq false   // a.compareTo(b) >= 0
}
