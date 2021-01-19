// InheritanceExtensions/InhExtensionsEx1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package inheritanceAndExtensionsExercise2
import atomictest.*

open class Dog {
  open fun speak() = trace("Bark!")
  open fun sit() = trace("Sitting...")
}

open class RealDog : Dog() {
  fun feed() = trace("Feed")
}

class ToyDog : Dog() {
  override fun speak() = trace("b.a.r.k.")
  fun changeBatteries() = trace("Change batteries")
}

fun Dog.play() {
  speak()
  sit()
}

fun RealDog.play() {
  (this as Dog).play()
  feed()
}

fun ToyDog.play() {
  (this as Dog).play()
  changeBatteries()
}

fun main() {
  val dog: Dog = ToyDog()
  dog.play()
  trace eq """
    b.a.r.k.
    Sitting...
  """
}
