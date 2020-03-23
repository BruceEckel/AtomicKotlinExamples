// Immutability/ColorBlend.kt
package colorblend
import atomictest.eq
import paintcolors.Color
import paintcolors.Color.*

fun blend(a: Color, b: Color) = when {
  a == b -> a
  a == brown || b == brown -> brown
  else -> when (a to b) {
    red to blue, blue to red -> purple
    red to yellow, yellow to red -> orange
    blue to yellow, yellow to blue -> green
    else -> {
      // Interesting but not accurate:
      val values = values()
      values[
        (a.ordinal + b.ordinal) % values.size]
    }
  }
}

fun test(
  mix: (a: Color, b: Color) -> Color?
) {
  mix(red, red) eq red
  mix(purple, brown) eq brown
  mix(red, yellow) eq orange
  mix(yellow, blue) eq green
  mix(purple, orange) eq blue // Not accurate
}

fun main() {
  test(::blend)
}
