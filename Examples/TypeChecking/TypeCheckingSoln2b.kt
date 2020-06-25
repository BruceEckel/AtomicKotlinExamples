// TypeChecking/TypeCheckingSoln2b.kt
package typecheckingsoln2b
import atomictest.eq
import typechecking.name

interface BeverageContainer {
  fun open(): String
  fun pour() = "${this.name}: Pour"
  fun recycle(): String
}

abstract class Can: BeverageContainer {
  override fun open() = "Pop Top"
}

class SteelCan: Can() {
  override fun recycle() = "Recycle Steel"
}

class AluminumCan: Can() {
  override fun recycle() = "Recycle Aluminum"
}

abstract class Bottle: BeverageContainer {
  override fun open() = "Remove Cap"
}

class GlassBottle: Bottle() {
  override fun recycle() = "Recycle Glass"
}

abstract class PlasticBottle: Bottle()

class PETBottle: PlasticBottle() {
  override fun recycle() = "Recycle PET"
}

class HDPEBottle: PlasticBottle() {
  override fun recycle() = "Recycle HDPE"
}

class DecomposableBottle: PlasticBottle() {
  override fun recycle() = "Decomposition tank"
}

fun main() {
  val refrigerator = listOf(
    SteelCan(), AluminumCan(),
    GlassBottle(),
    PETBottle(), HDPEBottle(),
    DecomposableBottle()
  )
  refrigerator.map { it.open() } eq
    "[Pop Top, Pop Top, Remove Cap, " +
    "Remove Cap, Remove Cap, Remove Cap]"
  refrigerator.map { it.recycle() } eq
    "[Recycle Steel, Recycle Aluminum, " +
    "Recycle Glass, " +
    "Recycle PET, Recycle HDPE, " +
    "Decomposition tank]"
}
