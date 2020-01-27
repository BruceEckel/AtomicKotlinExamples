// InheritanceExtensions/BatteryPet2.kt
package inheritanceextensions2
import atomictest.eq

interface EnergySource {
  fun replenish(): String
}

open class Pet(
  open val energySource: EnergySource
) {
  open fun speak() = ""
}

class DogFood : EnergySource {
  override fun replenish() = "Fill Bowl"
}

open class Dog : Pet(DogFood()) {
  override fun speak() = "Bark!"
}

fun Dog.sit() = "Sitting..."

class Batteries : EnergySource {
  override fun replenish() =
    "Change batteries"
}

class ToyDog: Dog() {
  override val energySource = Batteries()
}

fun play(pet: Pet) = pet.speak()

fun playWithDog(dog: Dog): String {
  play(dog) eq "Bark!"
  dog.sit() eq "Sitting..."
  return dog.energySource.replenish()
}

fun main() {
  val d1 = Dog()
  val d2 = ToyDog()
  play(d1) eq "Bark!"
  play(d2) eq "Bark!"
  playWithDog(d1) eq "Fill Bowl"
  playWithDog(d2) eq "Change batteries"
}
