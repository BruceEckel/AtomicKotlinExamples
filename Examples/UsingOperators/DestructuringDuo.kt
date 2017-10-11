// UsingOperators/DestructuringDuo.kt
import atomictest.eq

class Duo(val x: Int, val y: Int) {
  companion object {
    var msg = ""
  }
  operator fun component1(): Int {
    msg += "component1()"
    return x
  }
  operator fun component2(): Int {
    msg += "component2()"
    return y
  }
}

fun main(args: Array<String>) {
  val (a, b) = Duo(1, 2)
  a eq 1
  b eq 2
  Duo.msg eq "component1()component2()"
}
