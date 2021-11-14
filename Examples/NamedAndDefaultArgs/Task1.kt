// NamedAndDefaultArgs/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package namedAndDefaultArgumentsExercise1

class Rectangle(
  val side1: Double = 1.0,
  val side2: Double = 2.0,
  val color: String = "yellow"
) {
  override fun toString() =
    "$color rectangle $side1 x $side2"
}

fun main() {
  println(Rectangle())

  // Without argument names
  println(Rectangle(1.1))
  println(Rectangle(1.1, 2.2, "blue"))

  // Mixed positional and named arguments
  println(Rectangle(1.1, 2.2, color = "blue"))
  println(Rectangle(side1 = 1.1, side2 = 2.2, "blue"))

  // Names for all arguments
  println(Rectangle(color = "blue"))
  println(Rectangle(side1 = 1.1, side2 = 2.2, color = "blue"))
}
