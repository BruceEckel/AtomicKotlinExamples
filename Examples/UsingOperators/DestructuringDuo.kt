// UsingOperators/DestructuringDuo.kt
import atomictest.eq

class Duo(val x: Int, val y: Int) {
  operator fun component1(): Int {
    println("component1()")
    return x
  }
  operator fun component2(): Int {
    println("component2()")
    return y
  }
}

fun main(args: Array<String>) {
  val (a, b) = Duo(1, 2)
  a eq 1
  b eq 2
}
