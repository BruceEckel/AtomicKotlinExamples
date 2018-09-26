// ManipulatingLists/Flatten.kt
import atomictest.eq

fun main() {
  val list = listOf(
    listOf(1, 2, 3),
    listOf(4, 5, 6))
  list.flatten() eq listOf(1, 2, 3, 4, 5, 6)
}
