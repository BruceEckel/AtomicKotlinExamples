// ImportanceOfLambdas/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package theImportanceOfLambdasExercise2
import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> =
  strings.filter { it.isNotBlank() }

fun main() {
  filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}
