// ExtensionLambdas/Parameters.kt
package extensionlambdas
import atomictest.eq

val test1: Int.(Int) -> Boolean = {
  this % it == 0
}

val test2: Int.(Int, Int) -> Boolean = {
  arg1, arg2 -> this % (arg1 + arg2) == 0
}

val test3: Int.(Int, Int, Int) -> Boolean = {
  arg1, arg2, arg3 ->
  this % (arg1 + arg2 + arg3) == 0
}

fun main() {
  10.test1(10) eq true
  20.test2(10, 10) eq true
  30.test3(10, 10, 10) eq true
}
