// FunctionReferences/FormatList.kt
import atomictest.eq

var s = ""

fun format(n: Int) {
  s += "[$n]"
}

fun main(args: Array<String>) {
  val a = listOf(1, 2, 3, 4)
  val operation = ::format     // [1]
  a.forEach(operation)
  a.forEach(::format)
  s eq "[1][2][3][4][1][2][3][4]"
}
