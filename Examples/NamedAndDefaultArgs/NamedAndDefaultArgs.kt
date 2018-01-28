// NamedAndDefaultArgs/NamedAndDefaultArgs.kt
import atomictest.eq

fun getColor(
  red: Int = 0,
  green: Int = 0,
  blue: Int = 0
) = "($red, $green, $blue)"

fun main(args: Array<String>) {
  getColor(139) eq "(139, 0, 0)"
  getColor(blue = 139) eq "(0, 0, 139)"
  getColor(255, 165) eq "(255, 165, 0)"
  getColor(red = 128, blue = 128) eq
    "(128, 0, 128)"
}
