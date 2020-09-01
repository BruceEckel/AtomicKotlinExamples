// ImportanceOfLambdas/FunctionClosure.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package importanceoflambdas
import atomictest.eq

var x = 100

fun useX() {
  x++
}

fun main() {
  useX()
  x eq 101
}
