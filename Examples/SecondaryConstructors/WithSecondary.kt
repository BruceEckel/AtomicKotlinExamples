// SecondaryConstructors/WithSecondary.kt
package secondaryconstructors

class WithSecondary(i: Int) {
  init {
    println("Primary: $i")
  }

  constructor(c: Char) : this(c - 'A') {
    println("Secondary: '$c'")
  }

  constructor(s: String)
      : this(s.first()) {            // [1]
    println("Secondary: \"$s\"")
  }
  /* Won't compile without a call
     to the primary constructor:
  constructor(f: Float) {            // [2]
    println("Secondary: $f")
  }
  */
}

fun main() {
  fun sep() = println("-".repeat(10))
  WithSecondary(1)
  sep()
  WithSecondary('D')
  sep()
  WithSecondary("Last Constructor")
}
/* Output:
Primary: 1
----------
Primary: 3
Secondary: 'D'
----------
Primary: 11
Secondary: 'L'
Secondary: "Last Constructor"
*/
