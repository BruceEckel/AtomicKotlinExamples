// BuildingMaps/ColorBlend.kt
package buildmaps
import atomictest.eq
import buildmaps.Color.*

fun blend(a: Color, b: Color): Color = when {
  a == b -> a
  a == Brown || b == Brown -> Brown
  else -> when (a to b) {
    Red to Blue, Blue to Red -> Purple
    Red to Yellow, Yellow to Red -> Orange
    Blue to Yellow, Yellow to Blue -> Green
    else -> {
      // Interesting but not accurate:
      val values = values()
      values[
        (a.ordinal + b.ordinal) % values.size]
    }
  }
}

fun colorBlendTest(
  mix: (a: Color, b: Color) -> Color
) {
  mix(Red, Red) eq Red
  mix(Purple, Brown) eq Brown
  mix(Red, Yellow) eq Orange
  mix(Yellow, Blue) eq Green
  mix(Purple, Orange) eq Blue // Not accurate
}

fun main() {
  colorBlendTest(::blend)
}
