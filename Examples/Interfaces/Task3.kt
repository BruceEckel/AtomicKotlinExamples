// Interfaces/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interfacesExercise3
import atomictest.eq

interface Pet {
  val sound: String
}

class Dog: Pet {
  override val sound get() = "Bark!"
}

class Cat: Pet {
  override val sound get() = "Meow!"
}

class Hamster: Pet {
  override val sound get() = "Squeak!"
}

fun main() {
  val pets = listOf(Dog(), Cat(), Hamster())
  pets.map { it.sound } eq "[Bark!, Meow!, Squeak!]"
}
