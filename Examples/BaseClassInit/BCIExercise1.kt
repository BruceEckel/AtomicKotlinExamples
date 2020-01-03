// BaseClassInit/BCIExercise1.kt
package baseclassinit
import atomictest.eq

private var trace = ""

open class A {
  init {
    trace += "A"
  }
}

open class B : A() {
  init {
    trace += "B"
  }
}

class C : B() {
  init {
    trace += "C"
  }
}

fun main() {
  C()
  trace eq "ABC"
}
