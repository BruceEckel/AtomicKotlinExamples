// ExtensionLambdas/AnonymousFunction.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

val divideBy = fun Int.(d: Int): Boolean {
  return this % d == 0
}

fun exec(
  arg1: Int, arg2: Int,
  f: Int.(Int) -> Boolean
) = arg1.f(arg2)

fun main() {
  10.divideBy(2) eq true
  10.divideBy(3) eq false
  exec(10, 2, divideBy) eq true
  exec(10, 3, divideBy) eq false
}
