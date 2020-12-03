// DataClasses/DataClasses.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package dataclasses
import atomictest.*

class Person(val name: String)

data class Contact(
  val name: String,
  val number: String
)

fun main() {
  // These seem the same, but they're not:
  Person("Cleo") neq Person("Cleo")
  // A data class defines equality sensibly:
  Contact("Miffy", "1-234-567890") eq
  Contact("Miffy", "1-234-567890")
}
/* Sample output:
dataclasses.Person@54bedef2
Contact(name=Miffy, number=1-234-567890)
*/
