// Lambdas/TwoArgLambda.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c')
  list.mapIndexed { index, element ->
    "[$index: $element]"
  } eq listOf("[0: a]", "[1: b]", "[2: c]")
}
