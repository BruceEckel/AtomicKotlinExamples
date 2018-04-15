// FromListsToMaps/AssociateBy.kt
package fromliststomaps2
import atomictest.eq

data class Person(
  val name: String, val age: Int
)

fun main(args: Array<String>) {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  val map: Map<String, Person> =
    people.associateBy { it.name }
  map["Alice"] eq Person("Alice", 21)

  // Shouldn't be used if the key isn't unique
  // because elements might be lost:
  people.associateBy { it.age } eq
    mapOf(21 to Person("Alice", 21),
      25 to Person("Charlie", 25))
}
