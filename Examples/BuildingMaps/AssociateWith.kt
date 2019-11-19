// BuildingMaps/AssociateWith.kt
import buildingmaps.*
import atomictest.eq

fun main() {
  val map: Map<Person, String> =
    people().associateWith { it.name }
  map eq mapOf(
    Person("Alice", 21) to "Alice",
    Person("Arthricia", 15) to "Arthricia",
    Person("Bob", 25) to "Bob",
    Person("Bill", 25) to "Bill",
    Person("Birdperson", 42) to "Birdperson",
    Person("Charlie", 21) to "Charlie",
    Person("Crocubot", 42) to "Crocubot",
    Person("Franz", 21) to "Franz",
    Person("Revolio", 33) to "Revolio")
}
