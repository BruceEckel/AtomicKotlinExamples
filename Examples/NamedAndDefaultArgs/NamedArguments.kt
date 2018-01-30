// NamedAndDefaultArgs/NamedArguments.kt
package namedanddefaultargs1
import atomictest.eq

fun colorRGB(red: Int, green: Int, blue: Int) =
  "($red, $green, $blue)"

fun main(args: Array<String>) {
  colorRGB(red = 76, green = 89, blue = 0) eq
    "(76, 89, 0)"
  colorRGB(52, 34, blue = 0) eq "(52, 34, 0)"
}
