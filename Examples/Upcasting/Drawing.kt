// Upcasting/Drawing.kt
package upcasting
import atomictest.*

fun show(shape: Shape) {
  trace("Show: ${shape.draw()}")
}

fun main() {
  listOf(Circle(), Square(), Triangle())
    .forEach(::show)
  trace eq """
    Show: Circle.draw
    Show: Square.draw
    Show: Triangle.draw
  """
}
