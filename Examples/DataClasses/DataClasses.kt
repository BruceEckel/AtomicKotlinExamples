// DataClasses/DataClasses.kt
package dataclasses
import atomictest.*

data class Contact(
  val name: String,
  val number: String
)

class Person(val name: String)

fun main() {
  Contact("Miffy", "1-234-567890") eq
    Contact("Miffy", "1-234-567890")

  // These seem the same, but they're not:
  Person("Cleo") neq Person("Cleo")
}
/* Sample output:
Contact(name=Miffy, number=1-234-567890)
dataclasses.Person@54bedef2
*/
