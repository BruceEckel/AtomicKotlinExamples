// LocalFunctions/CustomLabel.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4, 5)
  val value = 3
  var result = ""
  list.forEach tag@{             // [1]
    result += "$it"
    if (it == value) return@tag  // [2]
  }
  result eq "12345"
}
