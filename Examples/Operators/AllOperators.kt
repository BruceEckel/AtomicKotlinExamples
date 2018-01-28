// Operators/AllOperators.kt
package operators

class C {
  // equals() cannot be an extension function
  // and must be defined specially:
  override operator
  fun equals(other: Any?) = true
}

// Unary operators:
operator fun C.unaryPlus() = this

operator fun C.unaryMinus() = this
operator fun C.not() = this

// Increment/decrement:
operator fun C.inc() = this

operator fun C.dec() = this

// Binary operators:
operator fun C.plus(rv: C) = rv

operator fun C.minus(rv: C) = rv
operator fun C.times(rv: C) = rv
operator fun C.div(rv: C) = rv
operator fun C.rem(rv: C) = rv
operator fun C.rangeTo(rv: C) = rv

// 'In' operator:
operator fun C.contains(rv: C) = true

// Indexed access:
operator fun C.get(i: Int) = this

operator fun C.set(i: Int, c: C) = this

// Augmented assignment:
operator fun C.plusAssign(rv: C) = Unit

operator fun C.minusAssign(rv: C) = Unit
operator fun C.timesAssign(rv: C) = Unit
operator fun C.divAssign(rv: C) = Unit
operator fun C.remAssign(rv: C) = Unit

// Comparison, must return Int:
operator fun C.compareTo(rv: C) = 1

fun main(args: Array<String>) {
  val c = C()
  +c               // unaryPlus()
  -c               // unaryMinus()
  !c               // not()
  var cc = C()
  cc++             // inc() (needs var)
  cc--             // dec() (needs var)
  c + c            // plus()
  c - c            // minus()
  c * c            // times()
  c / c            // div()
  c % c            // rem()
  c..c             // rangeTo()
  c in c           // contains()
  c !in c          // contains()
  c[2]             // get()
  c[2] = c         // set()
  c += c           // plusAssign()
  c -= c           // minusAssign()
  c *= c           // timesAssign()
  c /= c           // divAssign()
  c %= c           // remAssign()
  // equals():
  c == c
  c != c
  // compareTo():
  c < c
  c > c
  c <= c
  c >= c
}
