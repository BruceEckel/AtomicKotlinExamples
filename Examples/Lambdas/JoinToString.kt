// Lambdas/JoinToString.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(9, 11, 23, 32)
  list.joinToString(" ") { "[$it]" } eq
    "[9] [11] [23] [32]"
}
