// UsingOperators/ReadOnlyAndPlus.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  var list = listOf(1, 2)
  val initial = list
  list += 3
  list eq "[1, 2, 3]"
  list = list.plus(4)
  list eq "[1, 2, 3, 4]"
  initial eq "[1, 2]"
}
