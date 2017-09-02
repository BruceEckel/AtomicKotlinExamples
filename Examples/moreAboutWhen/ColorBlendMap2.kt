// moreAboutWhen/ColorBlendMap2.kt
package colorblendmap2
import atomicTest.eq
import paintcolors.Color
import paintcolors.Color.*

val blendMap =
  Color.values().zip(Color.values()).map {
    (a, b) -> Pair(a, b) to colorblend.blend(a, b)
  }.toMap()

fun blend2(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  println(blendMap)
  colorblendtest.test(::blend2)
}
