// Composition/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise1
import atomictest.*

open class Shape(
  val name: String,
  open val color: String
) {
  fun draw() = "drawing $color $name"
}

class Circle(
  val radius: Int,
  override val color: String
): Shape("circle of radius $radius", color)

class Rectangle(
  val height: Int,
  val width: Int,
  override val color: String
) : Shape("rectangle of size ${height}x$width", color)

fun main() {
  val circle = Circle(10, "red")
  val rectangle = Rectangle(3, 4, "blue")
  trace(circle.draw())
  trace(rectangle.draw())
  trace eq """
    drawing red circle of radius 10
    drawing blue rectangle of size 3x4
  """
}
