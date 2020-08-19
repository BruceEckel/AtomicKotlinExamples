// Lambdas/Mapping.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  val result =
    list.map({ "[${it.toUpperCase()}]" })
  result eq listOf("[A]", "[B]", "[C]", "[D]")
}
