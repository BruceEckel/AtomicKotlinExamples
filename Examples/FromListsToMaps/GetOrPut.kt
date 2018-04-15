// FromListsToMaps/GetOrPut.kt
import atomictest.eq

fun main(args: Array<String>) {
  val map = mapOf(1 to "one", 2 to "two")

  map.getOrElse(0) { "zero" } eq "zero"

  val mutableMap = map.toMutableMap()
  mutableMap.getOrPut(0) { "zero" } eq
    "zero"
  mutableMap eq "{1=one, 2=two, 0=zero}"
}
