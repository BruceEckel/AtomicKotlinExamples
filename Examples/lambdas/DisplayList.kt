// lambdas/DisplayList.kt
import atomicTest.eq

var s = ""

fun format(n: Int) {
  s += "[$n]"
}

fun main(args: Array<String>) {
  val a = listOf(1, 2, 3, 4)
  a.forEach(::format)          // [1]
  s eq "[1][2][3][4]"
}
