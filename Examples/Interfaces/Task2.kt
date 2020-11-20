// Interfaces/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interfacesExercise2

interface Pet {
  fun speak(): String
}

class Dog: Pet {
  override fun speak() = "Bark!"
}

class Cat: Pet {
  override fun speak() = "Meow!"
}

class Hamster: Pet {
  override fun speak() = "Squeak!"
}

fun main() {
  val pets = listOf(Dog(), Cat(), Hamster())
  for (pet in pets) {
    println(pet.speak())
  }
}
