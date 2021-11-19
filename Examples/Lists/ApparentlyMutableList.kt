// Lists/ApparentlyMutableList.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  var list = listOf('X') // Immutable
  list += 'Y' // Appears to be mutable
  list eq "[X, Y]"
}
