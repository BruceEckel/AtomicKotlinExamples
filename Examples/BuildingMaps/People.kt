// BuildingMaps/People.kt
package buildingmaps

data class Person(
  val name: String,
  val age: Int
)

val names = listOf("Alice", "Arthricia",
  "Bob", "Bill", "Birdperson", "Charlie",
  "Crocubot", "Franz", "Revolio")

val ages = listOf(21, 15, 25, 25, 42, 21,
  42, 21, 33)

fun people(): List<Person> =
  names.zip(ages) { name, age ->
    Person(name, age)
}
