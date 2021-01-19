// DataClasses/CopyDataClass.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package dataclasses
import atomictest.eq

data class DetailedContact(
  val name: String,
  val surname: String,
  val number: String,
  val address: String
)

fun main() {
  val contact = DetailedContact(
    "Miffy",
    "Miller",
    "1-234-567890",
    "1600 Amphitheatre Parkway")
  val newContact = contact.copy(
    number = "098-765-4321",
    address = "Brandschenkestrasse 110")
  newContact eq DetailedContact(
    "Miffy",
    "Miller",
    "098-765-4321",
    "Brandschenkestrasse 110")
}
