// moreAboutWhenExpressions/ColorBlend.kt
package colorblend

import paintcolors.Color
import paintcolors.Color.*

fun blend(a: Color, b: Color) = when {
  a == b -> a
  a == brown || b == brown -> brown
  else -> blendRest(a, b)
}

private fun blendRest(a: Color, b: Color) = when (a to b) {
  red to blue, blue to red -> purple
  red to yellow, yellow to red -> orange
  blue to yellow, yellow to blue -> green
  else -> {
    // Interesting, not accurate:
    val values = values()
    values[(a.ordinal + b.ordinal) % values.size]
  }
}
