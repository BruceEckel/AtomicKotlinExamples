// TypeChecking/TypeCheckingSoln1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package typeCheckingExercise1
import atomictest.eq
import typechecking.name

interface Shape {
  fun draw() = "$name: Draw"
  fun rotate() = ""
}

class Circle : Shape

class Square : Shape {
  override fun rotate() = "Square: Rotate"
}

class Triangle : Shape {
  override fun rotate() = "Triangle: Rotate"
}

fun turn(s: Shape) = s.rotate()

fun main() {
  val shapes = listOf(Circle(), Square())
  shapes.map { it.draw() } eq
    "[Circle: Draw, Square: Draw]"
  shapes.map { turn(it) } eq
    "[, Square: Rotate]"
  shapes.map { it.rotate() } eq
    "[, Square: Rotate]"
}
