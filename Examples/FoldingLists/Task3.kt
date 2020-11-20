// FoldingLists/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package foldingListsExercise3

import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
  fold(false) { found, element ->
    if (predicate(element)) true else found
  }

fun main() {
  val list = listOf(1, -2, 3)
  list.any { it < 0 } eq true
}
