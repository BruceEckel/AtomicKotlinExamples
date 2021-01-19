// interoperability/ReadOnlyByDefault.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
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
