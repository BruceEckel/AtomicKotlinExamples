// Booleans/Booleans2.kt

fun main(args: Array<String>) {
  val hour = 6
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val isOpen = hour >= open && hour <= closed
  println("Open: $isOpen")
}
/* Output:
Operating hours: 9 - 20
Open: false
*/
