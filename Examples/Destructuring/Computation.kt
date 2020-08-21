// Destructuring/Computation.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package destructuring
import atomictest.eq

data class Computation(
  val data: Int,
  val info: String
)

fun evaluate(input: Int) =
  if (input > 5)
    Computation(input * 2, "High")
  else
    Computation(input * 2, "Low")

fun main() {
  val (value, description) = evaluate(7)
  value eq 14
  description eq "High"
}
