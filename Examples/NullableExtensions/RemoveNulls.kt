// NullableExtensions/RemoveNulls.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val list = listOf("a", null, "b", null, "c")
  list eq "[a, null, b, null, c]"
  list.filterNotNull() eq "[a, b, c]"
}
