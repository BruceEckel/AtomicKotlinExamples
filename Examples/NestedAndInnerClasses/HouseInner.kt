// NestedAndInnerClasses/NestedHouse.kt
package innernested
import atomictest.*

abstract class Cleanable {
  open val parts: List<Cleanable> = listOf()
  open fun clean(): String =
    parts.map(Cleanable::clean).toString() +
    " ${this::class.simpleName} clean!\n"
}

class House: Cleanable() {
  override val parts = listOf(
    Bedroom("Master"),
    Bedroom("Guest")
  )
  class Bedroom(val id: String): Cleanable() {
    override fun clean() =
      "${super.clean()} ($id)\n"
    override val parts =
      listOf(Closet(), Bathroom())
    class Closet: Cleanable() {
      override val parts =
        listOf(Shelf(), Shelf())
      class Shelf: Cleanable()
    }
    class Bathroom: Cleanable() {
      override val parts =
        listOf(Toilet(), Sink())
      class Toilet: Cleanable()
      class Sink: Cleanable()
    }
  }
}

fun main() {
  Trace(House().clean()) eq
  """
  [[[[] Shelf clean!
  , [] Shelf clean!
  ] Closet clean!
  , [[] Toilet clean!
  , [] Sink clean!
  ] Bathroom clean!
  ] Bedroom clean!
   (Master)
  , [[[] Shelf clean!
  , [] Shelf clean!
  ] Closet clean!
  , [[] Toilet clean!
  , [] Sink clean!
  ] Bathroom clean!
  ] Bedroom clean!
   (Guest)
  ] House clean!
  """
}
