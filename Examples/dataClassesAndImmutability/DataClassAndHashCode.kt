// dataClassesAndImmutability/DataClassAndHashCode.kt
package dataclasses4

import atomicTest.eq

data class Contact(
  var name: String,
  var number: String
)

fun main(args: Array<String>) {
  val contact = Contact("Miffy", "1-234-567890")
  contact.hashCode() eq 843329298

  val theSame = Contact("Miffy", "1-234-567890")
  theSame.hashCode() eq 843329298

  contact.name = "Melissa"
  contact.hashCode() eq -2067767101
}
