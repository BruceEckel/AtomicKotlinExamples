// InnerClasses/InnerEx2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package innerClassesExercise2
import atomictest.eq

class Box(contains: String, label: String) {
  inner class Contents(val contains: String)
  inner class Destination(val label: String)
  private val contents = Contents(contains)
  private val destination = Destination(label)
  private val x = object : Any() {
    fun f() = "Any-based"
  }
  fun manifest() =
    "${contents.contains}: " +
    "${destination.label} ${x.f()}"
}

fun main() {
  Box("Computer", "Tasmania").manifest() eq
    "Computer: Tasmania Any-based"
}
