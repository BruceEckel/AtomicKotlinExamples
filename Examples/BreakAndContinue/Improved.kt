// BreakAndContinue/Improved.kt
import atomictest.eq

fun main() {
  val strings = mutableListOf<String>()
  for (c in 'a'..'c') {
    for (i in 1..4) {
      val value = "$c$i"
      if (value < "c3") {     // [1]
        strings.add(value)
      }
    }
  }
  strings eq listOf("a1", "a2", "a3", "a4",
    "b1", "b2", "b3", "b4", "c1", "c2")
}
