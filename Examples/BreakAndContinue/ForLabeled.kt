// BreakAndContinue/ForLabeled.kt
import atomictest.eq

fun main() {
  val strings = mutableListOf<String>()
  outer@ for (c in 'a'..'e') {
    for (i in 1..9) {
      if (i == 5) continue@outer
      if ("$c$i" == "c3") break@outer
      strings.add("$c$i")
    }
  }
  strings eq listOf("a1", "a2", "a3", "a4",
    "b1", "b2", "b3", "b4", "c1", "c2")
}
