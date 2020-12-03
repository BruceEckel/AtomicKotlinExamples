// IntroGenerics/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<E> {
  private val map = mutableMapOf<E, Int>()

  fun add(element: E) {
    map[element] = (map[element] ?: 0) + 1
  }

  fun count(element: E): Int {
    return map[element] ?: 0
  }

  fun toSet(): Set<E> = map.keys
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}
