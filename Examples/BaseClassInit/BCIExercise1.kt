// BaseClassInit/BCIExercise1.kt
package baseClassInitializationExercise1

open class A {
  init {
    println("A")
  }
}

open class B : A() {
  init {
    println("B")
  }
}

class C : B() {
  init {
    println("C")
  }
}

fun main() {
  C()
}
/* Exercise output:
A
B
C
*/
