// Composition/Task1StarterCode.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package compositionExercise1StarterCode
import atomictest.*

open class Shape(
  val name: String,
  open val color: String
) {
  fun draw() = "drawing $color $name"
}

class Circle(
  val radius: Int,
  val color: String,
  val shape: Shape =
    Shape("circle of radius $radius", color)
) {
  fun draw() = shape.draw()
}

class Rectangle(
  val height: Int,
  val width: Int,
  val color: String,
  val shape: Shape =
    Shape("rectangle of size ${height}x$width", color)
) {
  fun draw() = shape.draw()
}

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
