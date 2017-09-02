// moreAboutWhen/ColorBlendTest.kt
package colorblendtest
import atomicTest.eq
import paintcolors.Color
import paintcolors.Color.*
import colorblend.blend

fun test(mix: (a: Color, b: Color) -> Color?){
  mix(red, red) eq red
  mix(purple, brown) eq brown
  mix(red, yellow) eq orange
  mix(yellow, blue) eq green
  mix(purple, orange) eq blue
}

fun main(args: Array<String>) {
  test(::blend)
}
