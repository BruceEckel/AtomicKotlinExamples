// Booleans/Booleans3.kt

fun main(args: Array<String>) {
  val hour = 6
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val isClosed = hour < open || hour > closed
  println("Closed: $isClosed")
}
/* Output:
Operating hours: 9 - 20
Closed: true
*/
