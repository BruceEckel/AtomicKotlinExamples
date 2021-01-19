// DataClasses/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package dataClassesExercise2

data class AirlineTicket(
  val firstName: String,
  val lastName: String,
  val ticket: Int,
  val origin: String,
  val destination: String
)

fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket {
  return copy(firstName = otherFirstName,
    lastName = otherLastName)
}

fun main() {
  val ticket = AirlineTicket("Bruce", "Eckel",
    123456, "DEN", "HND")
  println(ticket.transferTicket("Svetlana", "Isakova"))
}
/* Output:
AirlineTicket(firstName=Svetlana, lastName=Isakova, ticket=123456, origin=DEN, destination=HND)
*/
