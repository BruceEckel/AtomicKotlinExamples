// FoldingLists/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package foldingListsExercise1
import atomictest.eq

fun <T> List<T>.size(): Int =
  fold(0) { length, _ ->
    length + 1
  }

fun main() {
  val list = listOf(1, 2, 3)
  list.size() eq 3
}
