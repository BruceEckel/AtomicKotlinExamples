// Immutability/ReadOnlyBlendMap3.kt
package readonlyblendmap3
import paintcolors.Color

class BlendMap {
  private val map = Color.values()
    .flatMap { a ->
      Color.values().map { b -> a to b }
    }
    .map {
      it to colorblend.blend(
        it.first, it.second)
    }
    .toMap()

  fun blend(a: Color, b: Color) = map[a to b]
}

fun main() {
  colorblend.test(BlendMap()::blend)
}
