// CreatingGenerics/InBoxAssignment.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package variance

val inBoxAny: InBox<Any> = InBox(Any())
val inBoxPet: InBox<Pet> = inBoxAny
val inBoxCat: InBox<Cat> = inBoxAny
val inBoxDog: InBox<Dog> = inBoxAny

fun main() {
  inBoxAny.put(Any())
  inBoxAny.put(Pet())
  inBoxAny.put(Cat())
  inBoxAny.put(Dog())

  inBoxPet.put(Pet())
  inBoxPet.put(Cat())
  inBoxPet.put(Dog())

  inBoxCat.put(Cat())
  inBoxDog.put(Dog())
}
