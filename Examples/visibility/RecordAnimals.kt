// visibility/RecordAnimals.kt

private var counter = 0                    // [1]

private fun recordAnimal(animal: Animal) = // [2]
  "\nAnimal #${counter++}: ${animal.name}"


private class Animal(val name: String)     // [3]

fun recordAnimals(): String {
  return recordAnimal(Animal("Tiger")) +
    recordAnimal(Animal("Antelope"))
}

fun recordAnimalsCount() =
  "$counter animals are here!"
