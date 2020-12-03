// ManipulatingLists/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package manipulatingListsExercise2
import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> =
  mapIndexed { index, e -> Pair(e, index) }

fun main() {
  val list = listOf('a', 'b', 'c')
  list.zipWithIndex() eq
    "[(a, 0), (b, 1), (c, 2)]"
}
