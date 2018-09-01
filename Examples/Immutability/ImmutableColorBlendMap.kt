// Immutability/ImmutableColorBlendMap.kt
package immutablecolorblendmap
import paintcolors.Color

fun blendPair(p: Pair<Color, Color>) =
  p to colorblend.blend(p.first, p.second)

val combinations = Color.values().flatMap {
  a -> Color.values().map { b -> a to b }
}

val blendMap = combinations.map {
  blendPair(it)
}.toMap()

fun blend(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  colorblendtest.test(::blend)
}
