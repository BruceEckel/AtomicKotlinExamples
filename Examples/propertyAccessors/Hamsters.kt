// propertyAccessors/Hamsters.kt
package propertyaccessors
import atomicTest.eq
import java.util.*

class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
  private val hamsters = mutableListOf<Hamster>()

  val capacity: Int
    get() = maxCapacity - hamsters.size

  fun isFull(): Boolean =
    hamsters.size == maxCapacity

  fun putHamster(hamster: Hamster): Boolean =
    if (!isFull()) {
      hamsters += hamster
      true
    } else {
      false
    }

  fun takeHamster(): Hamster =
      hamsters.removeAt(Random().nextInt(hamsters.size))
}

fun main(args: Array<String>) {
  val cage = Cage(maxCapacity = 2)
  cage.isFull() eq false
  cage.capacity eq 2
  cage.putHamster(Hamster("Alice")) eq true
  cage.putHamster(Hamster("Bob")) eq true
  cage.isFull() eq true
  cage.capacity eq 0
  cage.putHamster(Hamster("Charlie")) eq false
  cage.takeHamster()
  cage.capacity eq 1
}
