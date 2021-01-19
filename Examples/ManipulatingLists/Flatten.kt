// ManipulatingLists/Flatten.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(
    listOf(1, 2),
    listOf(4, 5),
    listOf(7, 8),
  )
  list.flatten() eq "[1, 2, 4, 5, 7, 8]"
}
