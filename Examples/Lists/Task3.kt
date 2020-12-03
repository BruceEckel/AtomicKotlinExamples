// Lists/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package listsExercise3
import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
  return s1.toList().sorted() == s2.toList().sorted()
}

fun main() {
  checkAnagrams("thing", "night") eq true
  checkAnagrams("leader", "dealer") eq true
  checkAnagrams("sector", "escort") eq true
  checkAnagrams("tablet", "battle") eq true
  checkAnagrams("friend", "finder") eq true
  checkAnagrams("senator", "treason") eq true
  checkAnagrams("terrain", "trainer") eq true
  checkAnagrams("teaching", "cheating") eq true

  checkAnagrams("pots", "stops") eq false
  checkAnagrams("escort", "sectors") eq false
  checkAnagrams("sections", "notices") eq false
}
