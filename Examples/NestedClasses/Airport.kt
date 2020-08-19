// NestedClasses/Airport.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package nestedclasses
import atomictest.eq
import nestedclasses.Airport.Plane

class Airport(private val code: String) {
  open class Plane {
    // Can access private properties:
    fun contact(airport: Airport) =
      "Contacting ${airport.code}"
  }
  private class PrivatePlane: Plane()
  fun privatePlane(): Plane = PrivatePlane()
}

fun main() {
  val denver = Airport("DEN")
  var plane = Plane()                   // [1]
  plane.contact(denver) eq "Contacting DEN"
  // Can't do this:
  // val privatePlane = Airport.PrivatePlane()
  val frankfurt = Airport("FRA")
  plane = frankfurt.privatePlane()
  // Can't do this:
  // val p = plane as PrivatePlane      // [2]
  plane.contact(frankfurt) eq "Contacting FRA"
}
