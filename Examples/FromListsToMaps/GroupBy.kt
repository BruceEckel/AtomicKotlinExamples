// FromListsToMaps/GroupBy.kt
package fromliststomaps
import atomictest.eq

data class Person(
  val name: String,
  val age: Int
)

fun main(args: Array<String>) {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))
  val map: Map<Int, List<Person>> =
    people.groupBy(Person::age)
  map[21] eq listOf(Person("Alice", 21))
  map[25] eq listOf(Person("Bob", 25),
    Person("Charlie", 25))
}
