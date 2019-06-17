// NothingType/CheckObject.kt
package nothingtype
import atomictest.capture
import atomictest.eq

class BadData(m: String): Exception(m)

fun checkObject(obj: Any?): String =
  if (obj is String)
    obj
  else
    throw BadData("Need String, got $obj")

fun main() {
  checkObject("abc") eq "abc"
  capture {
    checkObject(null)
  } eq "BadData: Need String, got null"
  capture {
    checkObject(123)
  } eq "BadData: Need String, got 123"
}
