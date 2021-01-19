// NestedClasses/NestedEx3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package nestedClassesExercise3
import atomictest.*

abstract class Cleanable(val id: String) {
  open val parts: List<Cleanable> = listOf()
  fun clean(): String =
  "${parts.map(Cleanable::clean)} $id clean\n"
}

class Shelf : Cleanable("Shelf")

class Closet : Cleanable("Closet") {
  override val parts =
    listOf(Shelf(), Shelf())
}

class Toilet : Cleanable("Toilet")

class Sink : Cleanable("Sink")

class Bathroom : Cleanable("Bathroom") {
  override val parts =
    listOf(Toilet(), Sink())
}

class Bedroom(id: String) : Cleanable(id) {
  override val parts =
    listOf(Closet(), Bathroom())
}

class House : Cleanable("House") {
  override val parts = listOf(
    Bedroom("Master Bedroom"),
    Bedroom("Guest Bedroom")
  )
}

fun main() {
  House().clean() eq """
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
