// NamedAndDefaultArgs/ArgumentOrder.kt
package color1
import atomictest.eq

fun main() {
  color(blue = 0, red = 99, green = 52) eq
    "(99, 52, 0)"
  // Can't put regular arguments after named:
  // color(red = 255, 255, 0)
}
