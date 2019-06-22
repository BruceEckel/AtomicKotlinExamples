// NothingType/CheckObject2.kt
package nothingtype
import atomictest.*

fun failWithBadData(obj: Any?): Nothing =
  throw BadData("Need String, got $obj")

fun checkObject2(obj: Any?): String =
  (obj as? String) ?: failWithBadData(obj)

fun main() {
  test(::checkObject2)
}
