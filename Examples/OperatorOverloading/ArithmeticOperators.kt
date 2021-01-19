// OperatorOverloading/ArithmeticOperators.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

// Unary operators:
operator fun E.unaryPlus() = E(v)
operator fun E.unaryMinus() = E(-v)
operator fun E.not() = this

// Increment/decrement:
operator fun E.inc() = E(v + 1)
operator fun E.dec() = E(v - 1)

fun unary(a: E) {
  +a               // unaryPlus()
  -a               // unaryMinus()
  !a               // not()

  var b = a
  b++             // inc() (must be var)
  b--             // dec() (must be var)
}

// Binary operators:
operator fun E.plus(e: E) = E(v + e.v)
operator fun E.minus(e: E) = E(v - e.v)
operator fun E.times(e: E) = E(v * e.v)
operator fun E.div(e: E) = E(v % e.v)
operator fun E.rem(e: E) = E(v / e.v)

fun binary(a: E, b: E) {
  a + b            // a.plus(b)
  a - b            // a.minus(b)
  a * b            // a.times(b)
  a / b            // a.div(b)
  a % b            // a.rem(b)
}

// Augmented assignment:
operator fun E.plusAssign(e: E) { v += e.v }
operator fun E.minusAssign(e: E) { v - e.v }
operator fun E.timesAssign(e: E) { v *= e.v }
operator fun E.divAssign(e: E) { v /= e.v }
operator fun E.remAssign(e: E) { v %= e.v }

fun assignment(a: E, b: E) {
  a += b           // a.plusAssign(b)
  a -= b           // a.minusAssign(b)
  a *= b           // a.timesAssign(b)
  a /= b           // a.divAssign(b)
  a %= b           // a.remAssign(b)
}

fun main() {
  val a = E(2)
  val b = E(3)
  a + b eq E(5)
  a * b eq E(6)
  val x = E(1)
  x += b * b
  x eq E(10)
}
