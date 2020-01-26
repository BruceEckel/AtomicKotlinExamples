// Composition/CompositionExercise2.kt
package compositionex2
import atomictest.*

private val trace = Trace()

open class Building(val name: String) {
  init { trace("Building: $name") }
}

class Kitchen(val name: String)  {
  init { trace("Kitchen: $name") }
}

class Bedroom(val name: String) {
  init { trace("Bedroom: $name") }
}

class Bathroom(val name: String) {
  init { trace("Bathroom: $name") }
}

class House(name: String) : Building(name) {
  val kitchens = listOf(
    Kitchen("Main"),
    Kitchen("Guest")
  )
  val bathrooms = listOf(
    Bathroom("Master"),
    Bathroom("Shared"),
    Bathroom("Guest")
  )
  val bedrooms = listOf(
    Bedroom("Master"),
    Bedroom("Son"),
    Bedroom("Daughter"),
    Bedroom("Guest")
  )
  init { trace("House: $name") }
}

fun main() {
  House("Our House")
  trace eq """
    Building: Our House
    Kitchen: Main
    Kitchen: Guest
    Bathroom: Master
    Bathroom: Shared
    Bathroom: Guest
    Bedroom: Master
    Bedroom: Son
    Bedroom: Daughter
    Bedroom: Guest
    House: Our House
  """
}
