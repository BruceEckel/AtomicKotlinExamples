// BuildingMaps/TransformingMap.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package buildingmaps
import atomictest.eq

fun main() {
  val even = mapOf(2 to "two", 4 to "four")
  even.map {                            // [1]
    "${it.key}=${it.value}"
  } eq listOf("2=two", "4=four")

  even.map { (key, value) ->            // [2]
    "$key=$value"
  } eq listOf("2=two", "4=four")

  even.mapKeys { (num, _) -> -num }     // [3]
    .mapValues { (_, str) -> "minus $str" } eq
    mapOf(-2 to "minus two",
      -4 to "minus four")

  even.map { (key, value) ->
    -key to "minus $value"
  }.toMap() eq mapOf(-2 to "minus two", // [4]
    -4 to "minus four")
}
