// HigherOrderFunctions/NullableReturn.kt
import atomictest.eq

fun main() {
  val transform: (String) -> Int? =
    { s: String -> s.toIntOrNull() }
  transform("112") eq 112
  transform("abc") eq null

  val list = listOf("112", "abc")
  list.mapNotNull(transform) eq listOf(112)
  list.mapNotNull { it.toIntOrNull() } eq
    listOf(112)
}
