// ComplexConstructors/MultipleInits.kt
package complexconstructors
import atomictest.eq

class Inits(i: Int, var s: String = "") {
  init {
    s = "1st: $i, "
  }
  val x: Int
  init {
    x = i + i
    s += "2nd: ${x}, "
  }
  val y: Int
  init {
    fun g() = i
    y = i * i + g()
    f()
  }
  fun f() {
    s += "3rd: ${y}"
  }
}

fun main() {
  var ti = Inits(1)
  ti.s eq "1st: 1, 2nd: 2, 3rd: 2"
  ti = Inits(2)
  ti.s eq "1st: 2, 2nd: 4, 3rd: 6"
  ti.x eq 4
  ti.y eq 6
}
