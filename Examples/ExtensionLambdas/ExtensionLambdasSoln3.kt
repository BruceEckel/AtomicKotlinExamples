// ExtensionLambdas/ExtensionLambdasSoln3.kt
package extensionlambdasoln3

open class Cleanser {
  fun selectBottle() = Unit
  fun sealBottle() = Unit
}

class SprayCleanser: Cleanser() {
  fun selectSprayer() = Unit
}

fun cleanser(
  formula: Cleanser.() -> Unit
): Cleanser {
  val result = Cleanser()
  result.selectBottle()
  result.formula()
  result.sealBottle()
  return result
}

fun sprayCleanser(
  formula: SprayCleanser.() -> Unit
): SprayCleanser {
  val result = SprayCleanser()
  result.selectBottle()
  result.selectSprayer()
  result.formula()
  result.sealBottle()
  return result
}

fun main() {
  // An empty lambda satisfies formula
  // Place where we describe -> Unit
  val c: Cleanser = cleanser { }
  val sc: SprayCleanser = sprayCleanser { }
}
