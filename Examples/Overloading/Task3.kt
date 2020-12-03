// Overloading/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package overloadingExercise3
import atomictest.eq

fun List<Int>.joinToString(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  return joinTo(StringBuilder(), separator, prefix, postfix).toString()
}

fun List<Int>.myJoinToString(
  separator: String,
  prefix: String,
  postfix: String
): String {
  return "MY: " + joinToString(separator, prefix, postfix)
}

fun List<Int>.myJoinToString(separator: String, prefix: String): String {
  return myJoinToString(separator, prefix, "")
}

fun List<Int>.myJoinToString(separator: String): String {
  return myJoinToString(separator, "", "")
}

fun List<Int>.myJoinToString(): String {
  return myJoinToString(", ", "", "")
}

/*
fun List<Int>.myJoinToString(prefix: String, postfix: String): String {
  return TODO()
}
*/

fun main() {
  val list = listOf(1, 2, 3)
  list.myJoinToString() eq
    "MY: 1, 2, 3"
  list.myJoinToString(separator = "|") eq
    "MY: 1|2|3"
  list.myJoinToString(separator = "..", prefix = "Numbers: ") eq
    "MY: Numbers: 1..2..3"
}
