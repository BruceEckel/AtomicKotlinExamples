// Polymorphism/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package polymorphismExercise2
import atomictest.*

open class Animal {
  open fun talk() {
    trace("Animal: talk")
  }
  open fun jump() {
    trace("Animal: jump")
    talk()
  }
}

class Frog : Animal() {
  override fun talk() {
    trace("Frog: talk")
    super.talk()
  }
  override fun jump() {
    trace("Frog: jump")
    super.jump()
  }
}

fun main() {
  val animal: Animal = Frog()
  animal.jump()
  trace eq """
    Frog: jump
    Animal: jump
    Frog: talk
    Animal: talk
  """
}
