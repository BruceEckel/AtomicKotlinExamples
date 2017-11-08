// Lambdas/Underscore.kt
import atomictest.eq

fun main(args: Array<String>) {
  var i = 0
  val m = mapOf("a" to 1, "b" to 2, "c" to 3)
  m.forEach { (_, v) -> i += v }
  i eq 6
}
