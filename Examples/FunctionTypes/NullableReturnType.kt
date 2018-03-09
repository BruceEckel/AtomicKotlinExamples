// FunctionTypes/NullableReturnType.kt
import atomictest.eq

fun main(args: Array<String>) {
  val transform: (String) -> Int? = 
    { it.toIntOrNull() }

  transform("112") eq 112
  transform("abc") eq null

  val list = listOf("112", "abc")
  list.mapNotNull(transform) eq listOf(112)

  list.mapNotNull { it.toIntOrNull() } eq
    listOf(112)
}
