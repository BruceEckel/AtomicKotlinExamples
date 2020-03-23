// PropertyAccessors/Hamsters2.kt
package propertyaccessors

class Cage2(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  fun capacity(): Int =
    maxCapacity - hamsters.size

  fun isFull(): Boolean =
    hamsters.size == maxCapacity
}
