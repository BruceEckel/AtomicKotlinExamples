// Visibility/RecordAnimals.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

private var index = 0                  // [1]

private class Animal(val name: String) // [2]

private fun recordAnimal(              // [3]
  animal: Animal
) {
  println("Animal #$index: ${animal.name}")
  index++
}

fun recordAnimals() {
  recordAnimal(Animal("Tiger"))
  recordAnimal(Animal("Antelope"))
}

fun recordAnimalsCount() {
  println("$index animals are here!")
}
