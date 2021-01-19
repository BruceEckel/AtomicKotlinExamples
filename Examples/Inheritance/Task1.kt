// Inheritance/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package inheritanceExercise1
import atomictest.eq

open class Cleanser {
  val ops = mutableListOf<String>()
  fun dilute() {
    ops += "dilute"
  }
  fun apply() {
    ops += "apply"
  }
  fun scrub() {
    ops += "scrub"
  }
}

open class Detergent : Cleanser()

fun main() {
  val detergent = Detergent()
  detergent.dilute()
  detergent.apply()
  detergent.scrub()
  detergent.ops eq
    listOf("dilute", "apply", "scrub")
}
