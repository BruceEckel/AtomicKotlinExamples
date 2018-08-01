// ExceptionHandling/InputCheck.kt
package exceptionhandling

import atomictest.eq

fun isDigit(ch: Char) = ch in '0'..'9'

fun intAbleString(s: String) =
  if (s.all(::isDigit)) s else "0"

fun main(args: Array<String>) {
  intAbleString("1.234").toInt() eq 0
  intAbleString("1,234").toInt() eq 0
  intAbleString("1234 ").toInt() eq 0
  intAbleString("1234").toInt() eq 1234
}
