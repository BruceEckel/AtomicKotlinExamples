// constructors/InitSection.kt
package constructors
import atomicTest.eq

class X(i: Int) {
  var s: String
  init {
    s = "Initialized: X(i=$i)"
  }
}

fun main(args: Array<String>) {
  val x1 = X(1)
  x1.s eq "Initialized: X(i=1)"
  val x2 = X(2)
  x2.s eq "Initialized: X(i=2)"
}
