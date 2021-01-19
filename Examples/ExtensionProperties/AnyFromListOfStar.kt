// ExtensionProperties/AnyFromListOfStar.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list: List<*> = listOf(1, 2)
  val any: Any? = list[0]
  any eq 1
}
