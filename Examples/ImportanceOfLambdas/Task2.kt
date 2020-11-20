// ImportanceOfLambdas/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theImportanceOfLambdasExercise2

import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> {
  return strings.filter { it.isNotBlank() }
}

fun main() {
  filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}
