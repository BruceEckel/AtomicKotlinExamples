// sets/RemoveDuplicates.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val list = listOf(3, 3, 2, 1, 2)
  list.toSet() eq setOf(1, 2, 3)

  "abbcc".toSet() eq setOf('a', 'b', 'c')
}
