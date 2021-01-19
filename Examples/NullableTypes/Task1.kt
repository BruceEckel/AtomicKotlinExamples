// NullableTypes/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nullableTypesExercise1
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters: MutableMap<String, Hamster> =
    mutableMapOf()

  fun put(hamster: Hamster): Boolean =
    if (hamsters.size == maxCapacity)
      false
    else {
      hamsters[hamster.name] = hamster
      true
    }

  fun get(name: String): Hamster? =
    hamsters[name]
}

fun main() {
  val cage = Cage(1)
  cage.get("Alice") eq null
}
