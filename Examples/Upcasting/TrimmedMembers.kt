// Upcasting/TrimmedMembers.kt
package upcasting
import atomictest.*

fun trim(shape: Shape) {
  trace(shape.draw())
  trace(shape.erase())
  // Doesn't compile:
  // shape.color()    // [1]
  // shape.rotate()   // [2]
}

fun main() {
  trim(Square())
  trim(Triangle())
  trace eq """
    Square.draw
    Square.erase
    Triangle.draw
    Triangle.erase
  """
}
