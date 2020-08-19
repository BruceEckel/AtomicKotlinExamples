// Lists/OutOfBounds.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val ints = listOf(1, 2, 3)
  capture {
    ints[3]
  } eq "ArrayIndexOutOfBoundsException: " +
    "Index 3 out of bounds for length 3"
}
