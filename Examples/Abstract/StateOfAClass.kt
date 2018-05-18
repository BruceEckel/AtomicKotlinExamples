// Abstract/StateOfAClass.kt
package state
import atomictest.eq

class IntList(val name: String) {
  val list = mutableListOf<Int>()
}

fun main(args: Array<String>) {
  val ints = IntList("fav numbers")
  ints.name eq "fav numbers"
  ints.list += 7
  ints.list eq listOf(7)
}
