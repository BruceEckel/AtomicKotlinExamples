// MoreAboutWhen/ColorBlendTest.kt
package colorblendtest
import atomictest.eq
import colorblend.blend
import paintcolors.Color
import paintcolors.Color.*

fun test(mix: (a: Color, b: Color) -> Color?) {
  mix(red, red) eq red
  mix(purple, brown) eq brown
  mix(red, yellow) eq orange
  mix(yellow, blue) eq green
  mix(purple, orange) eq blue
}

fun main(args: Array<String>) {
  test(::blend)
}
