// Destructuring/PairDestructuring.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package destructuring
import atomictest.eq

fun main() {
  val (value, description) = compute(7)
  value eq 14
  description eq "High"
}
