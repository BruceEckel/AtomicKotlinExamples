// Varargs/TwoFunctionsWithVarargs.kt
import atomicTest.eq

fun first(vararg numbers: Int) =
  numbers.fold("varargs:", {
    result, n -> result + " $n"
  })

fun second(vararg numbers: Int) =
  first(*numbers)

fun main(args: Array<String>) {
  second(7, 9, 32) eq "varargs: 7 9 32"
}
