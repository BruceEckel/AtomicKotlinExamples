// NestedAndInnerClasses/Hotel.kt
package nestedandinner
import atomictest.eq

class Hotel(private val reception: String) {
  inner class Room {
    // Contains reference to outer class:
    fun callReception() =
      "Calling $reception " +
      // Qualified 'this':
     "Calling ${this@Hotel.reception}"
  }
}

fun main() {
  val nycHotel = Hotel("311")
  // You need an outer class object to
  // create an instance of the inner class:
  val room = nycHotel.Room()
  room.callReception() eq
    "Calling 311 Calling 311"
}
