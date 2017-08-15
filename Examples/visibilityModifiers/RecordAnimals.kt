// visibilityModifiers/RecordAnimals.kt
private var counter = 0                          // [1]

private fun recordAnimal(animal: Animal) {       // [2]
  println("Animal #${counter++}: ${animal.name}")
}

private class Animal(val name: String)           // [3]

fun recordAnimals() {
  recordAnimal(Animal("Tiger"))
  recordAnimal(Animal("Antelope"))
}

fun recordAnimalsCount() {
  println("$counter animals are here!")
}
