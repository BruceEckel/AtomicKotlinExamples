// BuildingMaps/SimilarOperation.kt
package buildingmaps
import atomictest.eq

fun main() {
  val map = mapOf(1 to "one",
    -2 to "minus two")
  map.any { (key, _) -> key < 0 } eq true
  map.all { (key, _) -> key < 0 } eq false
  map.maxBy { it.key }?.value eq "one"
}
