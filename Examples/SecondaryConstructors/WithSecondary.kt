// SecondaryConstructors/WithSecondary.kt
package secondaryconstructors

class WithSecondary(val1: Int, val2: Int) {
  init {
    println("Primary: $val1, $val2")
  }
  constructor(value: Int): this(0, value) {
    println("Secondary: $value")
  }
  constructor(s: String): this(11) { // [1]
    println("Secondary: $s")
  }
  /* Won't compile without a call
     to the primary constructor:
  constructor(f: Float) {            // [2]
    println("Secondary: $f")
  }
  */
}

fun main(args: Array<String>) {
  fun sep() = println("-".repeat(10))
  WithSecondary(1, 2)
  sep()
  WithSecondary(3)
  sep()
  WithSecondary("Last Constructor")
}
/* Output:
Primary: 1, 2
----------
Primary: 0, 3
Secondary: 3
----------
Primary: 0, 11
Secondary: 11
Secondary: Last Constructor
*/
