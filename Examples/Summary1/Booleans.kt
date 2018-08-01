// Summary1/Booleans.kt

fun main(args: Array<String>) {
  val opens = 9
  val closes = 20
  println("Operating hours: $opens - $closes")
  val hour = 6
  println("Current time: " + hour)
  
  val isOpen = hour >= opens && hour <= closes
  println("Open: " + isOpen)
  println("Not open: " + !isOpen)
  val isClosed = hour < opens || hour > closes
  println("Closed: " + isClosed)
}
/* Output:
Operating hours: 9 - 20
Current time: 6
Open: false
Not open: true
Closed: true
*/
