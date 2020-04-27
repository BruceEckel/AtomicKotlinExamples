// Immutability/ReadOnlyBlendMap4.kt
package readonlyblendmap4
import paintcolors.Color

@ExperimentalStdlibApi
val map1: Map<Pair<Color, Color>, Color> =
  buildMap {
    for (a in Color.values()) {
      for (b in Color.values()) {
        this[a to b] = colorblend.blend(a, b)
      }
    }
  }

fun main() {
  //colorblend.test(BlendMap()::blend)
}
