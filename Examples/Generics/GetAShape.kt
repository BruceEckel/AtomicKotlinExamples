// Generics/GetAShape.kt
package generics
import atomictest.*
import kotlin.random.Random

private val rand = Random(11)

open class Shape(val color: String) {
  override fun toString() =
    "${this::class.simpleName} $color"
}
class Circle(color: String): Shape(color)
class Square(color: String): Shape(color)
class Triangle(color: String): Shape(color)

fun get1(shapes: List<Shape>): Shape {
  val shape = shapes.random(rand)
  trace("get1 $shape!")
  return shape
}

fun <T: Shape> get2(shapes: List<T>): T {
  val shape = shapes.random(rand)
  trace("get2 $shape!")
  return shape
}

fun main() {
  val circles: List<Circle> = listOf(
    Circle("Red"), Circle("Green")
  )
  val shapes: List<Shape> = listOf(
    Square("Blue"), Triangle("Yellow")
  )
  val shape1: Shape = get1(circles)
  val shape2: Circle = get2(circles)
  val shape3: Shape = get2(shapes)
  trace eq """
  get1 Circle Red!
  get2 Circle Green!
  get2 Square Blue!
  """
}
