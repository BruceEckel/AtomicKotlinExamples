// FunctionReferences/AnonymousFunction.kt
import atomictest.eq

fun main(args: Array<String>) {
  val a = listOf(1, 2, 3, 4)
  var s = ""
  a.forEach(fun(n: Int) { s += "[$n]" })
  s eq "[1][2][3][4]"
}
