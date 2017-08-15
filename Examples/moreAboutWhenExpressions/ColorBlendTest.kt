// moreAboutWhenExpressions/ColorBlendTest.kt
package colorblend

import atomicTest.eq
import paintcolors.Color.*

fun main(args: Array<String>) {
  blend(red, red) eq red
  blend(purple, brown) eq brown
  blend(red, yellow) eq orange
  blend(yellow, blue) eq green
  blend(purple, orange) eq blue
}
