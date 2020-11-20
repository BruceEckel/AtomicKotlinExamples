// ManipulatingLists/Task5.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package manipulatingListsExercise5

import atomictest.eq

fun <T, R> List<T>.flatMap(f: (T) -> List<R>): List<R> =
  map(f).flatten()

fun main() {
  val list = listOf(3, 1, 4)

  list.flatMap { (0..it).toList() } eq
    listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)
}
