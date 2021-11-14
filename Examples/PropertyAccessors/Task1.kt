// PropertyAccessors/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertyAccessorsExercise1

class Hamster(val name: String) {
  override fun toString() = "Hamster('$name')"
}

class Cage(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  val capacity: Int
    get() = maxCapacity - hamsters.size

  val full: Boolean
    get() = hamsters.size == maxCapacity

  val empty: Boolean
    get() = hamsters.isEmpty()

  fun put(hamster: Hamster): Boolean =
    if (full)
      false
    else {
      hamsters += hamster
      true
    }

  fun takeHamster(): Hamster =
    hamsters.removeAt(0)
}

fun main() {
  val cage = Cage(2)
  // cage.empty eq true
  cage.put(Hamster("Alice"))
  // cage.empty eq false
}
