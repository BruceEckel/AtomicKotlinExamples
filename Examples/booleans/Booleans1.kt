// booleans/Booleans1.kt
fun main(args: Array<String>) {
  val hour = 6
  val opens = 9
  val closes = 20
  println("Operating hours: $opens - $closes")
  val isOpen =
      if (hour >= opens && hour <= closes)   // [1]
        true
      else
        false
  println("Open: $isOpen")
}
/* Output:
Operating hours: 9 - 20
Open: false
*/
