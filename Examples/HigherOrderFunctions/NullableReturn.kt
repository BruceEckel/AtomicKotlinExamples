// HigherOrderFunctions/NullableReturn.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val transform: (String) -> Int? =
    { s: String -> s.toIntOrNull() }
  transform("112") eq 112
  transform("abc") eq null
  val x = listOf("112", "abc")
  x.mapNotNull(transform) eq "[112]"
  x.mapNotNull { it.toIntOrNull() } eq "[112]"
}
