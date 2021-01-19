// ComplexConstructors/Exercise3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package complexConstructorsExercise3
import atomictest.eq

class MultipleInit {
  val initOrder = mutableListOf<String>()
  init {
    initOrder += "one"
  }
  init {
    initOrder += "two"
  }
  init {
    initOrder += "three"
  }
}

fun main() {
  MultipleInit().initOrder eq "[one, two, three]"
}
