// Interfaces/StateOfAClass.kt
import atomictest.eq

class IntList(val i: Int) {
  val list = mutableListOf(i)
}

fun main(args: Array<String>) {
  val ints = IntList(0)
  ints.i eq 0
  ints.list += 1
  ints.list eq listOf(0, 1)
}
