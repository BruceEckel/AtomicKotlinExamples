// IntroGenerics/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package introductionToGenericsExercise1
import atomictest.eq

fun <T> List<T>.secondOrNull(): T? = getOrNull(1)

fun <T> List<T>.penultimateOrNull(): T? = getOrNull(size - 2)

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull() eq 2
  ints.penultimateOrNull() eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull() eq "b"
  strings.penultimateOrNull() eq "c"
}
