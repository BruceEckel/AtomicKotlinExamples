// FromListsToMaps/GroupBy.kt
package fromliststomaps
import atomictest.eq

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

fun main(args: Array<String>) {
  val map: Map<Int, List<Person>> =
    people().groupBy(Person::age)
  map[15] eq listOf(Person("Arthricia", 15))
  map[21] eq listOf(
    Person("Alice", 21),
    Person("Charlie", 21),
    Person("Franz", 21))
  map[22] eq null
  map[25] eq listOf(
    Person("Bob", 25),
    Person("Bill", 25))
  map[33] eq listOf(Person("Revolio", 33))
  map[42] eq listOf(
    Person("Birdperson", 42),
    Person("Crocubot", 42))
}
