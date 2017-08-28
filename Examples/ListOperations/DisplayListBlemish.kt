// ListOperations/DisplayListBlemish.kt
import atomicTest.eq

fun main(args: Array<String>) {
  var s = ""
  (1..4).forEach { s += "[$it]" }
  s eq "[1][2][3][4]"
}
