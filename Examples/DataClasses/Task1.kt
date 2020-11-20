// DataClasses/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package dataClassesExercise1

data class AirlineTicket(
  val firstName: String,
  val lastName: String,
  val ticket: Int,
  val origin: String,
  val destination: String
)

fun main() {
/*
  val ticket = AirlineTicket("Bruce", "Eckel", 123456, "DEN", "HND")
  println(ticket)
*/
}
/* Expected output:
AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)
*/
