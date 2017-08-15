// referencesAndMutability/References.kt
import atomicTest.eq

class Z(var n: Int)

fun main(args: Array<String>) {
  val z1 = Z(13)
  val z2 = z1
  z2.n eq 13
  z1.n = 97
  z2.n eq 97
}
