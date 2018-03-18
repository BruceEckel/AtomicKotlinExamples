// FunctionReferences/FormatList.kt
import atomictest.eq

var s = ""

fun format(n: Int) {
  s += "[$n]"
}

fun main(args: Array<String>) {
  val a = listOf(1, 2, 3, 4)
  val operation = ::format
  a.forEach(operation)
  a.forEach(::format)            // [1]
  s eq "[1][2][3][4][1][2][3][4]"
}
