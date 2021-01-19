// ManipulatingLists/Zipper.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val left = listOf("a", "b", "c", "d")
  val right = listOf("q", "r", "s", "t")

  left.zip(right) eq                 // [1]
    "[(a, q), (b, r), (c, s), (d, t)]"

  left.zip(0..4) eq                  // [2]
    "[(a, 0), (b, 1), (c, 2), (d, 3)]"

  (10..100).zip(right) eq            // [3]
    "[(10, q), (11, r), (12, s), (13, t)]"
}
