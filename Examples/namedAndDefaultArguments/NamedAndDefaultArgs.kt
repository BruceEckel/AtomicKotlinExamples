// namedAndDefaultArguments/NamedAndDefaultArgs.kt
import atomicTest.eq

fun getColor1(
    red: Int = 0,
    green: Int = 0,
    blue: Int = 0
) =
    "($red, $green, $blue)"

fun main(args: Array<String>) {
  val darkRed = "(139, 0, 0)"
  val darkBlue = "(0, 0, 139)"
  val orange = "(255, 165, 0)"
  val purple = "(128, 0, 128)"

  getColor1(139) eq darkRed
  getColor1(blue = 139) eq darkBlue
  getColor1(255, 165) eq orange
  getColor1(red = 128, blue = 128) eq purple
}
