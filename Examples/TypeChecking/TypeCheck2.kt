// TypeChecking/TypeCheck2.kt
package typechecking
import atomictest.eq

class Triangle: Shape {
  override fun draw() = "Triangle: Draw"
  fun rotate() = "Triangle: Rotate"
}

fun turn2(s: Shape) = when(s) {
  is Square -> s.rotate()
  is Triangle -> s.rotate()
  else -> ""
}

fun main() {
  val shapes =
    listOf(Circle(), Square(), Triangle())
  shapes.map { it.draw() } eq
    "[Circle: Draw, Square: Draw, " +
    "Triangle: Draw]"
  shapes.map { turn(it) } eq
    "[, Square: Rotate, ]"
  shapes.map { turn2(it) } eq
    "[, Square: Rotate, Triangle: Rotate]"
}
