// OperationsOnCollections/TakeOrDrop.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'X', 'Z')

  list.takeLast(3) eq "[c, X, Z]"
  list.takeLastWhile { it.isUpperCase() } eq
    "[X, Z]"

  list.drop(1) eq "[b, c, X, Z]"
  list.dropWhile { it.isLowerCase() } eq
    "[X, Z]"
}
