// FromKotlin/ExtensionsToJavaClass.kt
package FromKotlin

import atomictest.*

fun Chameleon.adjustToTemperature(isHot: Boolean) {
  color = if (isHot) "grey" else "black"
}

fun main(args: Array<String>) {
  val chameleon = Chameleon()
  chameleon.size = 2
  chameleon.size
  chameleon.adjustToTemperature(isHot = true)
  chameleon.color eq "grey"
}
