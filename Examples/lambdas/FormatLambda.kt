// Lambdas/FormatLambda.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  // fun format(n: Int) { s += "[$n]" }
  val format = { n: Int -> s += "[$n]" }
  listOf(1, 2, 3, 4).forEach(format)
  s eq "[1][2][3][4]"
}
