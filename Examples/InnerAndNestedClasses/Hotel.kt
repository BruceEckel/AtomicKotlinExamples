// InnerAndNestedClasses/Hotel.kt
class Airport(private val code: String) {
  class Plane {
    // doesn't contain reference to outer class
    // but can access private properties:
    fun contactAirportCenter(airport: Airport) {
      println("Making contact with " +
        airport.code)
    }
  }
}

class Hotel(val telephone: String) {
  inner class Room {
    // contains reference to outer class
    fun callReception() {
      println("Calling $telephone")
      // explicit 'this':
      println("Calling ${this@Hotel.telephone}")
    }
  }
}
