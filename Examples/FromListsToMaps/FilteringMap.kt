// FromListsToMaps/FilteringMap.kt
import atomictest.eq

fun main(args: Array<String>) {
  val map = mapOf(1 to "one",
    2 to "two", 3 to "three", 4 to "four")

  map.filterKeys { it % 2 == 1 } eq
    "{1=one, 3=three}"

  map.filterValues { it.contains('o') } eq
    "{1=one, 2=two, 4=four}"

  map.filter { entry ->
    entry.key % 2 == 1 &&
      entry.value.contains('o')
  } eq "{1=one}"
}
