// Upcasting/Shapes.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package upcasting

interface Shape {
  fun draw(): String
  fun erase(): String
}

class Circle: Shape {
  override fun draw() = "Circle.draw"
  override fun erase() = "Circle.erase"
}

class Square: Shape {
  override fun draw() = "Square.draw"
  override fun erase() = "Square.erase"
  fun color() = "Square.color"
}

class Triangle: Shape {
  override fun draw() = "Triangle.draw"
  override fun erase() = "Triangle.erase"
  fun rotate() = "Triangle.rotate"
}
