// Interfaces/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interfacesExercise3

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
  for (pet in pets) {
    println(pet.sound)
  }
}
