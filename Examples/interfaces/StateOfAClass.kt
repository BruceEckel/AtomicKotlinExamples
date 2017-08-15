// interfaces/StateOfAClass.kt
import atomicTest.eq

class MyClass(
    val i: Int
) {
  val list = mutableListOf(i)
}

fun main(args: Array<String>) {
  val my = MyClass(0)
  my.i eq 0
  my.list += 1
  my.list eq listOf(0, 1)
}
