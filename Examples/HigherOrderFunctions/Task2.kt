// HigherOrderFunctions/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package higherOrderFunctionsExercise2
import atomictest.eq

fun List<Int>.transformVersion1(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }

fun List<Int>.transformVersion2(): List<Int> =
  mapNotNull { if (it % 2 == 0) it * it else null }

fun main() {
  val list = listOf(1, 2, 3)
  list.transformVersion1() eq listOf(4)
  list.transformVersion2() eq listOf(4)
}
