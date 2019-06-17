// NothingType/CheckObject2.kt
package nothingtype
import atomictest.capture
import atomictest.eq

fun failWithBadData(obj: Any?): Nothing =
  throw BadData("Need String, got $obj")

fun checkObject2(obj: Any?): String =
  (obj as? String) ?: failWithBadData(obj)

fun main() {
  checkObject2("abc") eq "abc"
  capture {
    checkObject2(null)
  } eq "BadData: Need String, got null"
  capture {
    checkObject2(123)
  } eq "BadData: Need String, got 123"
}
