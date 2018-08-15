// SecondaryConstructors/DefaultArgPrimary.kt
package secondaryconstructors

class DefaultArgPrimary(n: Int = 99) {
  init {
    println("Primary: $n")
  }
  // this() does NOT call the primary
  // constructor with a default argument
  // of 99, but instead calls constructor():
  constructor(s: String): this() {
    println("Secondary: $s")
  }
  constructor(): this(14) {     // [1]
    println("Secondary()")
  }
  /* Ambiguous; won't compile:
  constructor(): this() {       // [2]
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
