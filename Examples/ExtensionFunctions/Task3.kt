// ExtensionFunctions/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionFunctionsExercise3
import atomictest.eq

class Rectangle(
  val x: Int,
  val y: Int,
  val width: Int,
  val height: Int
) {
  override fun toString(): String {
    return "[x=$x, y=$y, width=$width, height=$height]"
  }
}

fun Rectangle.coversZero(): Boolean =
  0 in x..(x + width) && 0 in y..(y + height)

fun main() {
  val first = Rectangle(-1, -1, 2, 2)
  val second = Rectangle(1, 1, 2, 2)
  first.coversZero() eq true
  second.coversZero() eq false
}
