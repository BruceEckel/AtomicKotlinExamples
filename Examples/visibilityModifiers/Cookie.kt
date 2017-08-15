// visibilityModifiers/Cookie.kt
class Cookie {
  private fun crumble() {  // [1]
    println("crumble")
  }

  public fun bite() {      // [2]
    println("bite")
  }

  fun eatUp() {            // [3]
    crumble()              // [4]
    bite()
  }
}

fun main(args: Array<String>) {
  val x = Cookie()
  x.bite()
  // Can't access private members:
  // x.crumble()
  x.eatUp()
}
/* Output:
bite
crumble
bite
*/
