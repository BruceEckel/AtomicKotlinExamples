// ComplexConstructors/Exercise2.kt
package complexconstructors
import atomictest.eq

class SumChars(text: String) {
  val sum: Int
  init {
    fun calc() =
      text.fold(0, {s, c -> s + c.toInt() })
    sum = calc()
  }
}

fun main() {
  SumChars("What?").sum eq 467
}
