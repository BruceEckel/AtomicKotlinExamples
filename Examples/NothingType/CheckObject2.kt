// NothingType/CheckObject2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtype

fun failWithBadData(obj: Any?): Nothing =
  throw BadData("Needs String, got $obj")

fun checkObject2(obj: Any?): String =
  (obj as? String) ?: failWithBadData(obj)

fun main() {
  test(::checkObject2)
}
