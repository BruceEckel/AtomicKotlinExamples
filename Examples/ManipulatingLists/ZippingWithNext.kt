// ManipulatingLists/ZippingWithNext.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')

  list.zipWithNext() eq listOf(
    Pair('a', 'b'),
    Pair('b', 'c'),
    Pair('c', 'd'))

  list.zipWithNext { a, b -> "$a$b" } eq
    "[ab, bc, cd]"
}
