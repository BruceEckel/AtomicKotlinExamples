// Lambdas/LambdaIt.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  listOf(1, 2, 3, 4).forEach({
    s += "[$it]"
  })
  s eq "[1][2][3][4]"
}
