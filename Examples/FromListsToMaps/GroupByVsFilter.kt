// FromListsToMaps/GroupByVsFilter.kt
import atomictest.eq

fun main(args: Array<String>) {
  val strings = listOf("abc", "ahh", "never")
  val groups = strings.groupBy { it.first() }

  // After the grouping is performed,
  // you have the fast access to the contents:
  groups['a'] eq listOf("abc", "ahh")
  groups['b'] eq null

  // Here you repeat the filtering
  // for every new character:
  strings.filter { it.first() == 'a' } eq
    listOf("abc", "ahh")
  strings.filter { it.first() == 'b' } eq
    listOf()

  strings.partition { it.first() == 'a' } eq
    "([abc, ahh], [never])"
}
