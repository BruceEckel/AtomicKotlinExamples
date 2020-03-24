// Immutability/MutableBlendMap.kt
package mutableblendmap
import paintcolors.Color

class BlendMap {
  private val map =
    mutableMapOf<Pair<Color, Color>, Color>()

  init {
    for (a in Color.values()) {
      for (b in Color.values()) {
        map[a to b] = colorblend.blend(a, b)
      }
    }
  }

  fun blend(a: Color, b: Color) = map[a to b]
}

fun main() {
  colorblend.test(BlendMap()::blend)
}
