// NamedAndDefaultArgs/CreateString.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3)
  list.toString() eq "[1, 2, 3]"
  list.joinToString() eq "1, 2, 3"
  list.joinToString(prefix = "(",
    postfix = ")") eq "(1, 2, 3)"
  list.joinToString(separator = ":") eq
    "1:2:3"
}
