// Varargs/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package variableArgumentListsExercise4

import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
  val result = mutableListOf<String>()
  for (list in listOfLists) {
    result.addAll(list)
  }
  return result
}

fun main() {
  val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
  flatten(listOfLists) eq listOf("a", "b", "c", "d")
}
