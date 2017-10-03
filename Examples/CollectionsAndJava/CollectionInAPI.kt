// CollectionsAndJava/CollectionInAPI.kt
package kotlincollections

data class Animal(val name: String)

interface Zoo {
  fun viewAnimals(): Collection<Animal>
}

fun visitZoo(zoo: Zoo) {
  val animals = zoo.viewAnimals()

  // Produces compile-time error:
  // animals.add(Animal("my grumpy cat"))
}
