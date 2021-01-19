// Lambdas/Underscore.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c')
  list.mapIndexed { index, _ ->
    "[$index]"
  } eq listOf("[0]", "[1]", "[2]")
}
