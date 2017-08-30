// interfaces/StateOfAClass.kt
import atomicTest.eq

class MyClass(val i: Int) {
  val list = mutableListOf(i)
}

fun main(args: Array<String>) {
  val mc = MyClass(0)
  mc.i eq 0
  mc.list += 1
  mc.list eq listOf(0, 1)
}
