// NestedAndInnerClasses/Hotel.kt
package innernested
import atomictest.eq

class Hotel(private val reception: String) {
  open inner class Room {
    // Contains reference to outer class:
    fun callReception() = "Calling $reception"
  }
  private inner class Closet : Room()
  fun closet(): Room = Closet()
}

fun main() {
  val nycHotel = Hotel("311")
  // You need an outer class object to
  // create an instance of the inner class:
  val room = nycHotel.Room()
  room.callReception() eq "Calling 311"
  val sfHotel = Hotel("0")
  val closet = sfHotel.closet()
  closet.callReception() eq "Calling 0"
}
