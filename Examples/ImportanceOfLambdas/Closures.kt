// ImportanceOfLambdas/Closures.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 5, 7, 10)
  val divider = 5
  list.filter { it % divider == 0 } eq
    listOf(5, 10)
}
