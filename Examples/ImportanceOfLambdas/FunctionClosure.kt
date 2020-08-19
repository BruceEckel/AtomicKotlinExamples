// ImportanceOfLambdas/FunctionClosure.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

var x = 100

fun useX() {
  x++
}

fun main() {
  useX()
  x eq 101
}
