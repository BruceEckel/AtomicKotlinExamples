// LocalFunctions/ReturningFunc.kt
package localfunctions
import atomictest.eq

fun first(): (Int) -> Int {
  val func = fun (i: Int): Int {
    return i + 1
  }
  func(1) eq 2
  return func
}

fun second(): (String) -> String {
  val func2 = { s: String -> "$s!" }
  func2("abc") eq "abc!"
  return func2
}

fun third(): () -> String {
  fun greet() = "Hi!"
  return ::greet
}

fun main() {
  val firstFun: (Int) -> Int = first()
  val secondFun: (String) -> String = second()
  val thirdFun: () -> String = third()

  firstFun(42) eq 43
  secondFun("xyz") eq "xyz!"
  thirdFun() eq "Hi!"
}
