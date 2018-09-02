// Immutability/ImmutableBlendMap2.kt
package immutableblendmap2
import paintcolors.Color

val blendMap = Color.values().flatMap {
  a -> Color.values().map { b -> a to b }
}.map {
  it to colorblend.blend(it.first, it.second)
}.toMap()

fun blend(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  colorblend.test(::blend)
}
