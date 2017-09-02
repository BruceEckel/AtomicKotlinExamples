// moreAboutWhen/ColorBlendMap.kt
package colorblendmap
import atomicTest.eq
import paintcolors.Color
import paintcolors.Color.*

private fun createBlendMap():
  Map<Pair<Color, Color>, Color> {
  val result =
    mutableMapOf<Pair<Color, Color>, Color>()
  for(a in Color.values())
    for(b in Color.values())
      result[a to b] = colorblend.blend(a, b)
  return result
}

val blendMap = createBlendMap()

fun blend2(a: Color, b: Color) =
  blendMap[a to b]

fun main(args: Array<String>) {
  colorblendtest.test(::blend2)
}
