// Upcasting/Assignment.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import upcasting.*

fun main() {
  val shape1: Shape = Square()
  val shape2: Shape = Triangle()
  // Doesn't compile:
  // shape1.color()
  // shape2.rotate()
}
