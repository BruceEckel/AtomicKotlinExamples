// Booleans/Booleans1.kt

fun main(args: Array<String>) {
  val hour = 6
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val isOpen =
    if (hour >= open && hour <= closed) // [1]
      true
    else
      false
  println("Open: $isOpen")
}
/* Output:
Operating hours: 9 - 20
Open: false
*/
