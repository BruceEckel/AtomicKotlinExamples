// combiningListsWithZip/Zipper.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val left = listOf("a", "b", "c", "d")
  val right = listOf("q", "r", "s", "t")

  left.zip(right) eq
      "[(a, q), (b, r), (c, s), (d, t)]"

  left.zip(0..4) eq
      "[(a, 0), (b, 1), (c, 2), (d, 3)]"

  left.zip(left.indices) eq
      "[(a, 0), (b, 1), (c, 2), (d, 3)]"
}
