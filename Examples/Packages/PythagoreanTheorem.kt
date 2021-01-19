// Packages/PythagoreanTheorem.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package pythagorean
import kotlin.math.sqrt

class RightTriangle(
  val a: Double,
  val b: Double
) {
  fun hypotenuse() = sqrt(a * a + b * b)
  fun area() = a * b / 2
}
