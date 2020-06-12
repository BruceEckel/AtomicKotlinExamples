// PropertyDelegation/MapDelegation.kt
package propertydelegation
import atomictest.eq

class Config(
  val map: MutableMap<String, Any?>
) {
  var name: String by map
  var age: Int by map
  var id: String by map
  var coord: Pair<Double, Double> by map
}

fun main() {
  val map = mutableMapOf<String, Any?>()
  val config = Config(map);
  config.name = "Bruno"
  config.age = 11
  config.id = "X97C111"
  config.coord = Pair(111.93, 1231.12)
  map eq "{name=Bruno, age=11, id=X97C111, " +
    "coord=(111.93, 1231.12)}"
}
