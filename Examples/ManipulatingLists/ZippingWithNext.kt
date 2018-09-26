// ManipulatingLists/ZippingWithNext.kt
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
