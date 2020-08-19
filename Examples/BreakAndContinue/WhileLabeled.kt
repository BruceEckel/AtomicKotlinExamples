// BreakAndContinue/WhileLabeled.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val strings = mutableListOf<String>()
  var c = 'a' - 1
  outer@ while (c < 'f') {
    c += 1
    var i = 0
    do {
      i++
      if (i == 5) continue@outer
      if ("$c$i" == "c3") break@outer
      strings.add("$c$i")
    } while (i < 10)
  }
  strings eq listOf("a1", "a2", "a3", "a4",
    "b1", "b2", "b3", "b4", "c1", "c2")
}
