// Interoperability/ReadOnlyByDefault.kt
package interop

data class Animal(val name: String)

interface Zoo {
  fun viewAnimals(): Collection<Animal>
}

fun visitZoo(zoo: Zoo) {
  val animals = zoo.viewAnimals()
  // Compile-time error:
  // animals.add(Animal("Grumpy Cat"))
}
