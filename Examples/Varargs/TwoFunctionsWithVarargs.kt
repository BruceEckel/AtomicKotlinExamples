// Varargs/TwoFunctionsWithVarargs.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

fun first(vararg numbers: Int) {
  for (i in numbers) {
    print("[$i]")
  }
}

fun second(vararg numbers: Int) =
  first(*numbers)

fun main() {
  second(7, 9, 32)
}
/* Output:
[7][9][32]
*/
