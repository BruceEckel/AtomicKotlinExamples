// Upcasting/Drawing.kt
package upcasting
import atomictest.*

private var trace = Trace()

fun show(shape: Shape) {
  trace("Show: ${shape.draw()}")
}

fun main() {
  val circle = Circle()
  val square = Square()
  val triangle = Triangle()
  show(circle)
  show(square)
  show(triangle)
  trace eq """
    Show: Circle.draw
    Show: Square.draw
    Show: Triangle.draw
  """
}
