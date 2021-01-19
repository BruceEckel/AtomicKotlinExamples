// SecondaryConstructors/WithSecondary.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package secondaryconstructors
import atomictest.*

class WithSecondary(i: Int) {
  init {
    trace("Primary: $i")
  }
  constructor(c: Char) : this(c - 'A') {
    trace("Secondary: '$c'")
  }
  constructor(s: String) :
    this(s.first()) {             // [1]
    trace("Secondary: \"$s\"")
  }
  /* Doesn't compile without a call
     to the primary constructor:
  constructor(f: Float) {         // [2]
    trace("Secondary: $f")
  }
  */
}

fun main() {
  fun sep() = trace("-".repeat(10))
  WithSecondary(1)
  sep()
  WithSecondary('D')
  sep()
  WithSecondary("Last Constructor")
  trace eq """
    Primary: 1
    ----------
    Primary: 3
    Secondary: 'D'
    ----------
    Primary: 11
    Secondary: 'L'
    Secondary: "Last Constructor"
  """
}
