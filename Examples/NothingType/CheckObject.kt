// NothingType/CheckObject.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtype
import atomictest.*

class BadData(m: String) : Exception(m)

fun checkObject(obj: Any?): String =
  if (obj is String)
    obj
  else
    throw BadData("Needs String, got $obj")

fun test(checkObj: (obj: Any?) -> String) {
  checkObj("abc") eq "abc"
  capture {
    checkObj(null)
  } eq "BadData: Needs String, got null"
  capture {
    checkObj(123)
  } eq "BadData: Needs String, got 123"
}

fun main() {
  test(::checkObject)
}
