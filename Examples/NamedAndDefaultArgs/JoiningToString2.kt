// NamedAndDefaultArgs/JoiningToString2.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3)
  list.joinToString(". ", "", "!") eq
    "1. 2. 3!"
  list.joinToString(separator = ". ",
    prefix = "", postfix = "!") eq "1. 2. 3!"
}
