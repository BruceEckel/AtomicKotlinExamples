// ExceptionHandling/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandlingsoln1
import atomictest.trace
import kotlin.random.Random             // STARTER CODE

data class Hamster(val name: String)

open class HamsterCageException(
  val msg: String
): Exception() {
  override fun toString() =
    "HamsterCageException: $msg"
}

class CageFullException(val limit: Int) :
  HamsterCageException("Cage full > $limit")

class NoSuchHamsterException(val id: String) :
  HamsterCageException("No Hamster $id")

class OutOfWaterException :
  HamsterCageException("Cage out of water")

class HamsterCage(val capacity: Int) {   // STARTER CODE
  private val rand = Random(47)          // STARTER CODE
  private val cage = HashSet<Hamster>()
  fun add(h: Hamster) {
    if (cage.size >= capacity)
      throw CageFullException(capacity)
    cage.add(h)
  }
  fun get(name: String): Hamster =
    cage.find { it.name == name } ?:
    throw NoSuchHamsterException(name)
  fun feed(): String {
    if ((0..10).random(rand) > 8)
      throw OutOfWaterException()
    return "Feeding complete"
  }
}

val hamsters = listOf(                 // STARTER CODE
  Hamster("Sally"), Hamster("Ralph"),  // STARTER CODE
  Hamster("Bob"), Hamster("Sergio"),   // STARTER CODE
  Hamster("Allison"), Hamster("Jane")) // STARTER CODE

fun test(hc: HamsterCage) {
  try {
    hamsters.forEach {
      trace("$it")
      hc.add(it)
    }
  } catch (e: CageFullException) {
    trace("$e")
  }
  try {
    trace("${hc.get(hamsters[0].name)}")
    trace("${hc.get("Morty")}")
  } catch (e: NoSuchHamsterException) {
    trace("$e")
  }
  try {
    repeat(3) { trace(hc.feed()) }
  } catch (e: OutOfWaterException) {
    trace("$e")
  }
}

// STARTER CODE:
fun main() {
  test(HamsterCage(3))
  trace eq """
    Hamster(name=Sally)
    Hamster(name=Ralph)
    Hamster(name=Bob)
    Hamster(name=Sergio)
    HamsterCageException: Cage full > 3
    Hamster(name=Sally)
    HamsterCageException: No Hamster Morty
    Feeding complete
    HamsterCageException: Cage out of water
  """
}
