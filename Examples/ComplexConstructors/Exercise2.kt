// ComplexConstructors/Exercise2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package complexConstructorsExercise2
import atomictest.eq

class SumChars(text: String) {
  val sum: Int
  init {
    fun calc() = text.sumBy { it.toInt() }
    sum = calc()
  }
}

fun main() {
//  SumChars("What?").sum eq 467
}
