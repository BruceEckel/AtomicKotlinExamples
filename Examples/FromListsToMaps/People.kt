// FromListsToMaps/People.kt
package fromliststomaps

data class Person(
  val name: String,
  val age: Int
)

fun people() = listOf("Alice", "Arthricia",
  "Bob", "Bill", "Birdperson", "Charlie",
  "Crocubot", "Franz", "Revolio").zip(
  listOf(21,15,25,25,42,21,42,21,33)) {
    name, age -> Person(name, age)
  }
