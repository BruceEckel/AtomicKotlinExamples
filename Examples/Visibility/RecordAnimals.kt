// Visibility/RecordAnimals.kt

private var index = 0                           // [1]

private class Animal(val name: String)          // [2]

private fun recordAnimal(animal: Animal) {      // [3]
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
