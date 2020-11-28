// Maps/ContactMap.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package maps
import atomictest.eq

class Contact(
  val name: String,
  val phone: String
) {
  override fun toString(): String {
    return "Contact('$name', '$phone')"
  }
}

fun main() {
  val miffy = Contact("Miffy", "1-234-567890")
  val cleo = Contact("Cleo", "098-765-4321")
  val contacts = mapOf(
    miffy.phone to miffy,
    cleo.phone to cleo)
  contacts["1-234-567890"] eq miffy
  contacts["1-111-111111"] eq null
}
