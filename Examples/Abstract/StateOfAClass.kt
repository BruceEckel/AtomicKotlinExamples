// Abstract/StateOfAClass.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package abstractstate
import atomictest.eq

class IntList(val name: String) {
  val list = mutableListOf<Int>()
}

fun main() {
  val ints = IntList("numbers")
  ints.name eq "numbers"
  ints.list += 7
  ints.list eq listOf(7)
}
