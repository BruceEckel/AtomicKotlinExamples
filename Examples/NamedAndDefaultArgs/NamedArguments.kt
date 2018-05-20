// NamedAndDefaultArgs/NamedArguments.kt
package color1
import atomictest.eq

fun color(red: Int, green: Int, blue: Int) =
  "($red, $green, $blue)"

fun main(args: Array<String>) {
  color(red = 76, green = 89, blue = 0) eq
    "(76, 89, 0)"
  color(52, 34, blue = 0) eq "(52, 34, 0)"
}
