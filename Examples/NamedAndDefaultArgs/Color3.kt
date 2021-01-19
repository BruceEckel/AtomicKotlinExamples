// NamedAndDefaultArgs/Color3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package color3
import atomictest.eq

class Color(
  val red: Int = 0,
  val green: Int = 0,
  val blue: Int = 0,
) {
  override fun toString() =
    "($red, $green, $blue)"
}

fun main() {
  Color(red = 77).toString() eq "(77, 0, 0)"
}
