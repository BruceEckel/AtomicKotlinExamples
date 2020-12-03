// LocalFunctions/ReturningFunc.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localfunctions
import atomictest.eq

fun first(): (Int) -> Int {
  val func = fun(i: Int) = i + 1
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

fun fourth() = fun() = "Hi!"

fun fifth() = { "Hi!" }

fun main() {
  val funRef1: (Int) -> Int = first()
  val funRef2: (String) -> String = second()
  val funRef3: () -> String = third()
  val funRef4: () -> String = fourth()
  val funRef5: () -> String = fifth()

  funRef1(42) eq 43
  funRef2("xyz") eq "xyz!"
  funRef3() eq "Hi!"
  funRef4() eq "Hi!"
  funRef5() eq "Hi!"

  first()(42) eq 43
  second()("xyz") eq "xyz!"
  third()() eq "Hi!"
  fourth()() eq "Hi!"
  fifth()() eq "Hi!"
}
