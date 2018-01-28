// Immutability/ColorBlendMap2.kt
package immutability
import paintcolors.Color

/* Original (mutable) version:
private fun createBlendMap():
  Map<Pair<Color, Color>, Color> {
  val result =
    mutableMapOf<Pair<Color, Color>, Color>()
  for(a in Color.values())
    for(b in Color.values())
      result[a to b] = colorblend.blend(a, b)
  return result
}
*/

fun blendPair(p: Pair<Color, Color>) =
  p to colorblend.blend(p.first, p.second)

val combinations = Color.values().flatMap {
  a -> Color.values().map { b -> a to b }
}

val blendMap = combinations.map {
  blendPair(it)
}.toMap()

fun blend2(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  colorblendtest.test(::blend2)
}
