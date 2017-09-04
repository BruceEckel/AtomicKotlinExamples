// MoreAboutWhen/ColorBlendMap2.kt
package colorblendmap2
import atomictest.eq
import paintcolors.Color
import paintcolors.Color.*

val blendMap = Color.values().flatMap {
  first -> Color.values().map {
    second -> first to second
    }
  }.map {
    it to colorblend.blend(it.first, it.second)
  }.toMap()

fun blend2(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  colorblendtest.test(::blend2)
}
