// Immutability/MutableBlendMap2.kt
package mutableblendmap2
import paintcolors.Color

class BlendMap {
  private val
    map: Map<Pair<Color, Color>, Color>
  init {
    val imap =
      mutableMapOf<Pair<Color,Color>,Color>()
    for(a in Color.values())
      for(b in Color.values())
        imap[a to b] = colorblend.blend(a, b)
    map = imap.toMap()
  }
  fun blend(a: Color, b: Color) = map[a to b]
}

fun main(args: Array<String>) {
  colorblend.test(BlendMap()::blend)
}
