// ExtensionLambdas/AnonymousFunction.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

fun exec(
  arg1: Int, arg2: Int,
  f: Int.(Int) -> Boolean
) = arg1.f(arg2)

fun main() {
  exec(10, 2, fun Int.(d: Int): Boolean {
    return this % d == 0
  }) eq true
}
