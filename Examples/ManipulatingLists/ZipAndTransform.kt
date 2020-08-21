// ManipulatingLists/ZipAndTransform.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package manipulatinglists
import atomictest.eq

data class Person(
  val name: String,
  val id: Int
)

fun main() {
  val names = listOf("Bob", "Jill", "Jim")
  val ids = listOf(1731, 9274, 8378)
  names.zip(ids) { name, id ->
    Person(name, id)
  } eq "[Person(name=Bob, id=1731), " +
    "Person(name=Jill, id=9274), " +
    "Person(name=Jim, id=8378)]"
}
