// NothingType/ThrowAsPartOfOtherExpressions1.kt
package nothingtype

import atomictest.capture
import atomictest.eq

class IncorrectData(m: String) : Exception(m)

fun checkObject(obj: Any?): String =
  if (obj is String)
    obj
  else
    throw IncorrectData(
      "String is expected, was: $obj")

fun main() {
  checkObject("abc") eq "abc"
  capture {
    checkObject(null)
  } eq "IncorrectData: String is expected, " +
    "was: null"
  capture {
    checkObject(123)
  } eq "IncorrectData: String is expected, " +
    "was: 123"
}
