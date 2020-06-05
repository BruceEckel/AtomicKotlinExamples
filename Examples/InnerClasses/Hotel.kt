// InnerClasses/Hotel.kt
package innerclasses
import atomictest.eq

class Hotel(private val reception: String) {
  open inner class Room(val id: Int = 0) {
    // Uses 'reception' from outer class:
    fun callReception() =
      "Room $id Calling $reception"
  }
  private inner class Closet : Room()
  fun closet(): Room = Closet()
}

fun main() {
  val nycHotel = Hotel("311")
  // You need an outer object to
  // create an instance of the inner class:
  val room = nycHotel.Room(319)
  room.callReception() eq
    "Room 319 Calling 311"
  val sfHotel = Hotel("0")
  val closet = sfHotel.closet()
  closet.callReception() eq "Room 0 Calling 0"
}
