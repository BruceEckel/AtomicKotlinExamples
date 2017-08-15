// namedAndDefaultArguments/NamedArguments.kt
import atomicTest.eq

fun getColor(red: Int, green: Int, blue: Int) =
    "($red, $green, $blue)"

fun main(args: Array<String>) {
  val yellow = "(255, 255, 0)"
  getColor(red = 255, green = 255, blue = 0) eq yellow
  getColor(255, 255, blue = 0) eq yellow
}
