// lambdas/UnpackInLambda.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val items = "abc".withIndex().map { (n, ch) -> "$n: $ch" }
  items eq "[0: a, 1: b, 2: c]"
}
