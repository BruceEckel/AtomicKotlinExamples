// ExtensionLambdas/Parameters.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

val zero: Int.() -> Boolean = {
  this == 0
}

val one: Int.(Int) -> Boolean = {
  this % it == 0
}

val two: Int.(Int, Int) -> Boolean = {
  arg1, arg2 ->
    this % (arg1 + arg2) == 0
}

val three: Int.(Int, Int, Int) -> Boolean = {
  arg1, arg2, arg3 ->
    this % (arg1 + arg2 + arg3) == 0
}

fun main() {
  0.zero() eq true
  10.one(10) eq true
  20.two(10, 10) eq true
  30.three(10, 10, 10) eq true
}
