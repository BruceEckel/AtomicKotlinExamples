// lambdas/AssignAnonymous.kt
import atomictest.eq

fun main(args: Array<String>) {
  val p1 = { "A Lambda" }
  var p2 = { -> "More Explicit" }
  p1() eq "A Lambda"
  p2() eq "More Explicit"
}
