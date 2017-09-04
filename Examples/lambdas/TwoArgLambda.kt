// Lambdas/TwoArgLambda.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  "Duck".forEachIndexed {
    n, c -> s += "[$n:$c]"
  }
  s eq "[0:D][1:u][2:c][3:k]"
}
