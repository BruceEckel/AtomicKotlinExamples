// LocalFunctions/LabeledReturn.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  var result = ""
  list.forEach {
    result += "$it"
    if (it == value) return@forEach
  }
  result eq "12345"
}
