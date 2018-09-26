// FromListsToMaps/AssociateBy.kt
import fromliststomaps.*
import atomictest.eq

fun main() {
  val map: Map<String, Person> =
    people().associateBy { it.name }
  map eq mapOf(
    "Alice" to Person("Alice", 21),
    "Arthricia" to Person("Arthricia", 15),
    "Bob" to Person("Bob", 25),
    "Bill" to Person("Bill", 25),
    "Birdperson" to Person("Birdperson", 42),
    "Charlie" to Person("Charlie", 21),
    "Crocubot" to Person("Crocubot", 42),
    "Franz" to Person("Franz", 21),
    "Revolio" to Person("Revolio", 33))

  // associateBy() fails when the key isn't
  // unique -- elements disappear:
  val ages = people().associateBy { it.age }
  ages eq mapOf(
    21 to Person("Franz", 21),
    15 to Person("Arthricia", 15),
    25 to Person("Bill", 25),
    42 to Person("Crocubot", 42),
    33 to Person("Revolio", 33))
}
