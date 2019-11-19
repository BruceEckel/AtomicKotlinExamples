// DownCasting/WhenSubjectVariable.kt
package downcasting

import kotlin.random.Random

interface SuperComputer {
  val answer: Any?
}

class DeepThoughtVersionII : SuperComputer {
  override val answer: Any?
    get() = Random.nextInt()
}

fun main() {
  val superComputer: SuperComputer =
    DeepThoughtVersionII()
  when (val ans = superComputer.answer) {//[1]
    is Int ->
      if (ans > 0) {                    // [2]
        println("Answer is positive!")
      } else {
        println("Answer is negative")
      }
    else -> println("Not a number: $ans")
  }
  // Doesn't compile:
  /*
  when (superComputer.answer) {
    is Int ->
      if (superComputer.answer > 0) {   // [3]
        println("Answer is positive!")
      }
  }
  */
}
