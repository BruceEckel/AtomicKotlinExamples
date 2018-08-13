// SecondaryConstructors/DefaultArgPrimary.kt
package secondaryconstructors
import atomictest.eq

class DefaultArgPrimary(n: Int = 99) {
  init {
    println("Primary: $n")
  }
  constructor(s: String): this() {
    println("Secondary: $s")
  }
  constructor(): this(14) {
    println("Secondary()")
  }
  /* Ambiguous; won't compile:
  constructor(): this() {
    println("Secondary()")
  }
  */
}

fun main(args: Array<String>) {
  fun sep() = println("-".repeat(10))
  DefaultArgPrimary(11)
  sep()
  DefaultArgPrimary("Two")
  sep()
  DefaultArgPrimary()
}
/* Output:
Primary: 11
----------
Primary: 14
Secondary()
Secondary: Two
----------
Primary: 14
Secondary()
*/
