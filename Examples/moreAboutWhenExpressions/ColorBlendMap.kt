// moreAboutWhenExpressions/ColorBlendMap.kt
package colorblendmap

import atomicTest.eq
import paintcolors.Color
import paintcolors.Color.*

val blender = createBlendMap()

private fun createBlendMap(): Map<Pair<Color, Color>, Color> {
  val result = mutableMapOf<Pair<Color, Color>, Color>()
  for (a in Color.values()) {
    for (b in Color.values()) {
      result[a to b] = colorblend.blend(a, b)
    }
  }
  return result
}

fun blend(a: Color, b: Color) = blender[a to b]

fun main(args: Array<String>) {
  blend(red, yellow) eq orange
  blend(red, red) eq red
  blend(yellow, blue) eq green
  blend(purple, orange) eq blue
  blend(purple, brown) eq brown
}
