// Summary2/Quadratic.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summary2
import kotlin.math.sqrt
import atomictest.*

class Roots(
  val root1: Double,
  val root2: Double
)

fun quadraticZeroes(
  a: Double,
  b: Double,
  c: Double
): Roots {
  if (a == 0.0)
    throw IllegalArgumentException(
      "a is zero")
  val underRadical = b * b - 4 * a * c
  if (underRadical < 0)
    throw IllegalArgumentException(
      "Negative underRadical: $underRadical")
  val squareRoot = sqrt(underRadical)
  val root1 = (-b - squareRoot) / (2 * a)
  val root2 = (-b + squareRoot) / (2 * a)
  return Roots(root1, root2)
}

fun main() {
  capture {
    quadraticZeroes(0.0, 4.0, 5.0)
  } eq "IllegalArgumentException: " +
    "a is zero"
  capture {
    quadraticZeroes(3.0, 4.0, 5.0)
  } eq "IllegalArgumentException: " +
    "Negative underRadical: -44.0"
  val roots = quadraticZeroes(1.0, 2.0, -8.0)
  roots.root1 eq -4.0
  roots.root2 eq 2.0
}
