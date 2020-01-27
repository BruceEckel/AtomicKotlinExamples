// InheritanceExtensions/BatteryPet.kt
package inheritanceextensions
import atomictest.eq

interface Pet {
  fun speak(): String
}

open class Dog : Pet {
  override fun speak() = "Bark!"
  fun sit() = "Sitting..."
}

class ToyDog: Dog() {
  fun changeBatteries() = "Change batteries"
}

fun play(pet: Pet) = pet.speak()

fun playWithDog(dog: Dog) {
  play(dog) eq "Bark!"
  dog.sit() eq "Sitting..."
}

fun playWithToyDog(dog: ToyDog) {
  playWithDog(dog)
  dog.changeBatteries() eq "Change batteries"
}

fun main() {
  val d1 = Dog()
  val d2 = ToyDog()
  play(d1) eq "Bark!"
  play(d2) eq "Bark!"
  playWithDog(d1)
  playWithDog(d2)
  playWithToyDog(d2)
}
