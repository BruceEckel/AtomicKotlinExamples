// ComplexConstructors/InitSection.kt
package complexconstructors
import atomictest.eq

class X(val i: Int, msg: String) {
  var s: String
  init {
    s = "$msg: $i"
  }
}

fun main(args: Array<String>) {
  val x1 = X(9, "x1")
  x1.s eq "x1: 9"
  val x2 = X(15, "x2")
  x2.s eq "x2: 15"
}
