// Lambdas/DisplayDuck.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  "Duck".toList().forEach { s += "[$it]" }
  s eq "[D][u][c][k]"
}
