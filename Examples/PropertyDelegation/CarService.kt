// PropertyDelegation/CarService.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package propertydelegation
import atomictest.eq

class Driver(
  val map: MutableMap<String, Any?>
) {
  var name: String by map
  var age: Int by map
  var id: String by map
  var available: Boolean by map
  var coord: Pair<Double, Double> by map
}

fun main() {
  val info = mutableMapOf<String, Any?>(
    "name" to "Bruno Fiat",
    "age" to 22,
    "id" to "X97C111",
    "available" to false,
    "coord" to Pair(111.93, 1231.12)
  )
  val driver = Driver(info);
  driver.available eq false
  driver.available = true
  info eq "{name=Bruno Fiat, age=22, " +
    "id=X97C111, available=true, " +
    "coord=(111.93, 1231.12)}"
}
