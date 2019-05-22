// NothingType/ThrowAsPartOfOtherExpressions2.kt
package nothingtype

import atomictest.capture
import atomictest.eq

fun failWithIncorrectData(obj: Any?): Nothing =
  throw IncorrectData("String is expected, was: $obj")

fun checkObject2(obj: Any?): String =
  (obj as? String) ?: failWithIncorrectData(obj)

fun main() {
  checkObject2("abc") eq "abc"
  capture {
    checkObject2(null)
  } eq "IncorrectData: String is expected, " +
    "was: null"
  capture {
    checkObject2(123)
  } eq "IncorrectData: String is expected, " +
    "was: 123"
}
