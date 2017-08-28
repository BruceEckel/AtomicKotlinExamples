// lambdas/DuckForEach.kt
import atomicTest.eq

fun main(args: Array<String>) {
  var s = ""
  "Duck".forEach { s += "[$it]" }
  s eq "[D][u][c][k]"
}
