// KotlinCollectionsAndJava/CollectionInAPI.kt
package kotlincollections

data class Animal(val name: String)

interface Zoo {
  fun viewAnimals(): Collection<Animal>
}

fun visitZoo(zoo: Zoo) {
  val animals = zoo.viewAnimals()

  // doesn't compile:
  //animals.add(Animal("my grumpy cat"))
}
