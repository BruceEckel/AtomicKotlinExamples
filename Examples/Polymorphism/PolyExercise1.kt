// Polymorphism/PolyExercise1.kt
package polymorphismex1
import atomictest.eq

open class Pet {
  open fun speak() = "Pet"
}

class Dog : Pet() {
  override fun speak() = "Bark!"
}

class Cat : Pet() {
  override fun speak() = "Meow"
}

class Hamster : Pet() {
  override fun speak() = "Squeak!"
}

fun talk(pet: Pet) = pet.speak()

fun main() {
  talk(Dog()) eq "Bark!"
  talk(Cat()) eq "Meow"
  talk(Hamster()) eq "Squeak!"
}
