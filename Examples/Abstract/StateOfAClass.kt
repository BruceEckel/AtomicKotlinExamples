// Abstract/StateOfAClass.kt
package abstractstate
import atomictest.eq

class IntList(val name: String) {
  val list = mutableListOf<Int>()
}

fun main(args: Array<String>) {
  val ints = IntList("numbers")
  ints.name eq "numbers"
  ints.list += 7
  ints.list eq listOf(7)
}
