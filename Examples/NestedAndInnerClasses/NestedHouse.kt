// NestedAndInnerClasses/NestedHouse.kt
package innernested
import atomictest.*

abstract class Cleanable(val id: String) {
  open val parts: List<Cleanable> = listOf()
  fun clean(): String =
    parts.map(Cleanable::clean).toString() +
    " $id clean\n"
}

class House: Cleanable("House") {
  override val parts = listOf(
    Bedroom("Master Bedroom"),
    Bedroom("Guest Bedroom")
  )
  class Bedroom(id: String): Cleanable(id) {
    override val parts =
      listOf(Closet(), Bathroom())
    class Closet: Cleanable("Closet") {
      override val parts =
        listOf(Shelf(), Shelf())
      class Shelf: Cleanable("Shelf")
    }
    class Bathroom: Cleanable("Bathroom") {
      override val parts =
        listOf(Toilet(), Sink())
      class Toilet: Cleanable("Toilet")
      class Sink: Cleanable("Sink")
    }
  }
}

fun main() {
  Trace(House().clean()) eq
  """
  [[[[] Shelf clean
  , [] Shelf clean
  ] Closet clean
  , [[] Toilet clean
  , [] Sink clean
  ] Bathroom clean
  ] Master Bedroom clean
  , [[[] Shelf clean
  , [] Shelf clean
  ] Closet clean
  , [[] Toilet clean
  , [] Sink clean
  ] Bathroom clean
  ] Guest Bedroom clean
  ] House clean
  """
}
