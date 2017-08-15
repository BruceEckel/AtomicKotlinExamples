// referencesAndMutability/AnUnchangingVar.kt
import atomicTest.eq

class Y(val n: Int)

fun main(args: Array<String>) {
  var y = Y(11)
  y.n eq 11
//  y.n = 22 // Not allowed
  y = Y(22)
}
