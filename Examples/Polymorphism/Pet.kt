// Polymorphism/Pet.kt
package polymorphism
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

fun talk(pet: Pet) = pet.speak()   // [1]

fun main() {
  talk(Dog()) eq "Bark!"           // [2]
  talk(Cat()) eq "Meow"            // [3]
}
