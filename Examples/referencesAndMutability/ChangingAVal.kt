// referencesAndMutability/ChangingAVal.kt
import atomicTest.eq

class X(var n: Int)

fun main(args: Array<String>) {
  val x = X(11)
  x.n eq 11
  x.n = 22
  x.n eq 22
//  x = X(22) // Not allowed
}
