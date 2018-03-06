// CollectionOperations/SetsAndMaps.kt
import atomictest.eq

fun main(args: Array<String>) {
  val set = setOf("a", "ab")
  set.maxBy { it.length }?.length eq 2  // [1]

  val map = mapOf(1 to "one", 2 to "two")
  map.filterKeys { it > 1 } eq "{2=two}"// [2]

  map.getOrElse(0) { "zero" } eq "zero" // [3]

  val mutableMap = map.toMutableMap()
  mutableMap.getOrPut(0) { "zero" } eq  // [4]
    "zero"
  mutableMap eq "{1=one, 2=two, 0=zero}"
}
