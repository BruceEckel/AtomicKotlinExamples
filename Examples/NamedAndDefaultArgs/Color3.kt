// NamedAndDefaultArgs/Color3.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package color3
import atomictest.eq

class Color(
  val red: Int = 0,
  val green: Int = 0,
  val blue: Int = 0
) {
  override fun toString(): String {
    return "($red, $green, $blue)"
  }
}

fun main() {
  Color(red = 77).toString() eq "(77, 0, 0)"
}
