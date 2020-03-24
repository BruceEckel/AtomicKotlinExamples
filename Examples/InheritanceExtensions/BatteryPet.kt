// InheritanceExtensions/BatteryPet.kt
package inheritanceextensions
import atomictest.*

private val trace = Trace()

interface Pet {
  fun speak()
}

open class Dog : Pet {
  override fun speak() = trace("Bark!")
  fun sit() = trace("Sitting...")
}

class ToyDog: Dog() {
  fun changeBatteries() =
    trace("Change batteries")
}

fun play(pet: Pet) = pet.speak()

fun playWithDog(dog: Dog) {
  play(dog)
  dog.sit()
}

fun playWithToyDog(dog: ToyDog) {
  playWithDog(dog)
  dog.changeBatteries()
}

fun main() {
  val dog1 = Dog()
  val dog2 = ToyDog()
  play(dog1)
  play(dog2)
  playWithDog(dog1)
  playWithDog(dog2)
  playWithToyDog(dog2)
  trace eq """
  Bark!
  Bark!
  Bark!
  Sitting...
  Bark!
  Sitting...
  Bark!
  Sitting...
  Change batteries
  """
}
