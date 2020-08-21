// BuildingMaps/GetOrPut.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package buildingmaps
import atomictest.eq

fun main() {
  val map = mapOf(1 to "one", 2 to "two")

  map.getOrElse(0) { "zero" } eq "zero"

  val mutableMap = map.toMutableMap()
  mutableMap.getOrPut(0) { "zero" } eq
    "zero"
  mutableMap eq "{1=one, 2=two, 0=zero}"
}
