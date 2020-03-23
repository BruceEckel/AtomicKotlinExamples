// Immutability/MutableBlendMap2.kt
package mutableblendmap2
import paintcolors.Color

class BlendMap {
  private val
    imap: Map<Pair<Color, Color>, Color>

  init {
    val map = mutableMapOf<
      Pair<Color, Color>, Color>()
    for (a in Color.values()) {
      for (b in Color.values()) {
        map[a to b] = colorblend.blend(a, b)
      }
    }
    imap = map.toMap()  // Read-only Map
  }

  fun blend(a: Color, b: Color) = imap[a to b]
}

fun main() {
  colorblend.test(BlendMap()::blend)
}
