// ExceptionHandling/ExceptHandlingSoln1.kt
package exceptionhandlingsolution1
import atomictest.*
import kotlin.random.Random

private val trace = Trace()

data class Hamster(val name: String)

open class HamsterCageException(
  val msg: String
): Exception("HamsterCageException: $msg")

class CageFullException(val limit: Int):
  HamsterCageException("Cage full > $limit")

class NoSuchHamsterException(val id: String):
  HamsterCageException("No Hamster $id")

class OutOfWaterException():
  HamsterCageException("Cage out of water")

class HamsterCage(val capacity: Int) {
  private val cage = HashSet<Hamster>()
  private val seed = Random(47)
  fun add(h: Hamster) {
    if(cage.size >= capacity)
      throw CageFullException(capacity)
    cage.add(h)
  }
  fun get(name: String): Hamster {
    for(h in cage)
      if(h.name == name)
        return h
    throw NoSuchHamsterException(name)
  }
  fun feed() {
    if((0..10).random(seed) > 8)
      throw OutOfWaterException()
  }
}

fun main() {
  trace eq """

  """
}
