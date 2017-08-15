// dataClasses/CopyDataClass.kt
import atomicTest.eq

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

fun main(args: Array<String>) {
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
