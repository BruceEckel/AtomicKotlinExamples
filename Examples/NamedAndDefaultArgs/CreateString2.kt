// NamedAndDefaultArgs/CreateString2.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3)
  list.joinToString(". ", "", "!") eq
    "1. 2. 3!"
  list.joinToString(separator = ". ",
    postfix = "!") eq "1. 2. 3!"
}
