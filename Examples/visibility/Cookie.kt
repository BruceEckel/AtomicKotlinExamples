// Visibility/Cookie.kt
class Cookie(
  private var isReady: Boolean   // [1]
) {
  private fun crumble() =        // [2]
    println("crumble")

  public fun bite() =            // [3]
    println("bite")

  fun eatUp() {                  // [4]
    isReady = true               // [5]
    crumble()     
    bite()
  }
}

fun main(args: Array<String>) {
  val x = Cookie(false)
  x.bite()
  // Can't access private members:
  // x.ready
  // x.crumble()
  x.eatUp()
}
/* Output:
bite
crumble
bite
*/
