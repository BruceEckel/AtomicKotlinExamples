// ImportanceOfLambdas/Closures3.kt
import atomictest.eq

var x = 100

fun useX() {
  x++
}

fun main() {
  useX()
  x eq 101
}
