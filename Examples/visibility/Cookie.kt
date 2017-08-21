// visibility/Cookie.kt
import atomicTest.eq

class Cookie {
  private fun crumble() =  // [1]
    "crumble"

  public fun bite() =      // [2]
    "bite"

  fun eatUp() =            // [3]
    crumble() +            // [4]
    bite()
}

fun main(args: Array<String>) {
  val x = Cookie()
  x.bite() eq "bite"
  // Can't access private members:
  // x.crumble()
  x.eatUp() eq "crumblebite"
}
