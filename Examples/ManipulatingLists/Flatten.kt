// ManipulatingLists/Flatten.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(
    listOf(1, 2, 3),
    listOf(4, 5, 6))
  list.flatten() eq listOf(1, 2, 3, 4, 5, 6)
}
