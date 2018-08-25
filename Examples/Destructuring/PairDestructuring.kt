// Destructuring/PairDestructuring.kt
package destructuring
import atomictest.eq

fun main(args: Array<String>) {
  val (value, description) = compute(7)
  value eq 14
  description eq "High"
}
