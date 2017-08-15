// dataClassesAndImmutability/DataClassesWithVars.kt
package dataclasses3

import atomicTest.eq

data class Contact(
  var name: String,
  var number: String
)

fun main(args: Array<String>) {
  val contact = Contact("Miffy", "1-234-567890")
  val favLanguage = hashMapOf(contact to "Kotlin")
  favLanguage[contact] eq "Kotlin"             // [1]

  contact.name = "Melissa"
  // Information stored by this contact is lost:
  favLanguage[contact] eq null                 // [2]
}
