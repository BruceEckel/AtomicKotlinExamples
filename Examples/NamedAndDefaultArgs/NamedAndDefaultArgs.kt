// NamedAndDefaultArgs/NamedAndDefaultArgs.kt
package namedanddefaultargs2
import atomictest.eq

fun colorRGB(
  red: Int = 0,
  green: Int = 0,
  blue: Int = 0
) = "($red, $green, $blue)"

fun main(args: Array<String>) {
  colorRGB(139) eq "(139, 0, 0)"
  colorRGB(blue = 139) eq "(0, 0, 139)"
  colorRGB(255, 165) eq "(255, 165, 0)"
  colorRGB(red = 128, blue = 128) eq
    "(128, 0, 128)"
}
