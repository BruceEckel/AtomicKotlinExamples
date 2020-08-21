// UsingOperators/DestructuringDuo.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

class Duo(val x: Int, val y: Int) {
  operator fun component1(): Int {
    trace("component1()")
    return x
  }
  operator fun component2(): Int {
    trace("component2()")
    return y
  }
}

fun main() {
  val (a, b) = Duo(1, 2)
  a eq 1
  b eq 2
  trace eq """
    component1()
    component2()
  """
}
