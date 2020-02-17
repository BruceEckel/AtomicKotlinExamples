// NestedClasses/NestedEx2.kt
package nestedclassesex2
import atomictest.*

abstract class Cleanable(val id: String) {
  open val parts: List<Cleanable> = listOf()
  fun clean(): String =
    "${parts.map(Cleanable::clean)} $id clean\n"
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
      override val parts = listOf(
        Shelf(), Shelf(), Drawer(), Drawer()
      )
      class Shelf: Cleanable("Shelf")
      class Drawer: Cleanable("Drawer")
    }
    class Bathroom: Cleanable("Bathroom") {
      override val parts =
        listOf(Toilet(), Sink(), Bathtub())
      class Toilet: Cleanable("Toilet")
      class Sink: Cleanable("Sink")
      class Bathtub: Cleanable("Bathtub")
    }
  }
}

fun main() {
  Trace(House().clean()) eq """
  [[[[] Shelf clean
  , [] Shelf clean
  , [] Drawer clean
  , [] Drawer clean
  ] Closet clean
  , [[] Toilet clean
  , [] Sink clean
  , [] Bathtub clean
  ] Bathroom clean
  ] Master Bedroom clean
  , [[[] Shelf clean
  , [] Shelf clean
  , [] Drawer clean
  , [] Drawer clean
  ] Closet clean
  , [[] Toilet clean
  , [] Sink clean
  , [] Bathtub clean
  ] Bathroom clean
  ] Guest Bedroom clean
  ] House clean
  """
}
