// Immutability/ImmutableBlendMap.kt
package immutableblendmap
import paintcolors.Color

val combinations = Color.values().flatMap {
  a -> Color.values().map { b -> a to b }
}

val blendMap = combinations.map {
  it to colorblend.blend(it.first, it.second)
}.toMap()

fun blend(a: Color, b: Color) =
  blendMap[a to b]

fun main() {
  colorblend.test(::blend)
}
