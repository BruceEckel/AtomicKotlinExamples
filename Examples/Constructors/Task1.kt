// Constructors/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package constructorsExercise1

class Floating(val d: Double) {
  override fun toString(): String = d.toString()
}

fun main() {
  val floating = Floating(2.0)
  println(floating)
}
