// classArguments/VisibleClassArgs.kt
import atomicTest.eq

class ClassArg2(var a: Int)
class ClassArg3(val a: Int)

fun main(args: Array<String>) {
  val ca2 = ClassArg2(20)
  val ca3 = ClassArg3(21)

  ca2.a eq 20
  ca3.a eq 21
  ca2.a = 24
  ca2.a eq 24
  // Can't do this:
  // ca3.a = 35
}
