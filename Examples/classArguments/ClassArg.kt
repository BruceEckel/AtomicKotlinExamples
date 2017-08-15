// classArguments/ClassArg.kt
import atomicTest.eq

class ClassArg(a: Int) {
  val f = a * 10
}

fun main(args: Array<String>) {
  val ca = ClassArg(19)
  ca.f eq 190
//  ca.a // error
}
