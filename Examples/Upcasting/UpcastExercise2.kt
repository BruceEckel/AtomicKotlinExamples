// Upcasting/UpcastExercise2.kt
package upcasting
import atomictest.*

private var trace = Trace()
private var counter = 0

abstract class Apple(val type: String) {
  private val id = counter++
  init {
    trace("$type $id")
  }
  abstract fun consume()
}

class GrannySmith : Apple("GrannySmith") {
  override fun consume() =
    trace("chomp $type")
}

class Gala : Apple("Gala") {
  override fun consume() =
    trace("bite $type")
}

class Fuji : Apple("Fuji") {
  override fun consume() =
    trace("press $type")
}

class Braeburn : Apple("Braeburn") {
  override fun consume() =
    trace("peel $type")
}

fun main() {
  val apples: List<Apple> = listOf(
    GrannySmith(),
    Gala(),
    Fuji(),
    Braeburn()
  )
  apples.forEach { it.consume() }
  trace eq """
    GrannySmith 0
    Gala 1
    Fuji 2
    Braeburn 3
    chomp GrannySmith
    bite Gala
    press Fuji
    peel Braeburn
  """
}
