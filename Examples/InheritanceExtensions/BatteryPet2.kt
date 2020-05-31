// InheritanceExtensions/BatteryPet2.kt
package inheritanceextensions2
import atomictest.*

private val trace = Trace()

interface Energy {
  fun replenish() = trace("Fill Bowl")
}

open class Pet(open val energy: Energy) {
  open fun speak() = trace("???")
}

class DogFood : Energy

open class Dog : Pet(DogFood()) {
  override fun speak() = trace("Bark!")
}

fun Dog.sit() = trace("Sitting...")

class Batteries : Energy {
  override fun replenish() =
    trace("Change batteries")
}

class ToyDog: Dog() {
  override val energy = Batteries()
}

fun play(pet: Pet) = pet.speak()

fun playWithDog(dog: Dog) {
  play(dog)
  dog.sit()
  dog.energy.replenish()
}

fun main() {
  val dog1 = Dog()
  val dog2 = ToyDog()
  play(dog1)
  play(dog2)
  playWithDog(dog1)
  playWithDog(dog2)
  trace eq """
  Bark!
  Bark!
  Bark!
  Sitting...
  Fill Bowl
  Bark!
  Sitting...
  Change batteries
  """
}
