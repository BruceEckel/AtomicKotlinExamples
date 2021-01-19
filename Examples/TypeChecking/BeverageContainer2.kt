// TypeChecking/BeverageContainer2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package typechecking2
import atomictest.eq

sealed class BeverageContainer {
  abstract fun open(): String
  abstract fun pour(): String
}

sealed class Can : BeverageContainer() {
  override fun open() = "Pop Top"
  override fun pour() = "Can: Pour"
}

class SteelCan : Can()
class AluminumCan : Can()

sealed class Bottle : BeverageContainer() {
  override fun open() = "Remove Cap"
  override fun pour() = "Bottle: Pour"
}

class GlassBottle : Bottle()
sealed class PlasticBottle : Bottle()
class PETBottle : PlasticBottle()
class HDPEBottle : PlasticBottle()

fun BeverageContainer.recycle() =
  when(this) {
    is Can -> "Recycle Can"
    is Bottle -> "Recycle Bottle"
  }

fun BeverageContainer.recycle2() =
  when(this) {
    is Can -> when(this) {
      is SteelCan -> "Recycle Steel"
      is AluminumCan -> "Recycle Aluminum"
    }
    is Bottle -> when(this) {
      is GlassBottle -> "Recycle Glass"
      is PlasticBottle -> when(this) {
        is PETBottle -> "Recycle PET"
        is HDPEBottle -> "Recycle HDPE"
      }
    }
  }

fun main() {
  val refrigerator = listOf(
    SteelCan(), AluminumCan(),
    GlassBottle(),
    PETBottle(), HDPEBottle()
  )
  refrigerator.map { it.open() } eq
    "[Pop Top, Pop Top, Remove Cap, " +
    "Remove Cap, Remove Cap]"
  refrigerator.map { it.recycle() } eq
    "[Recycle Can, Recycle Can, " +
    "Recycle Bottle, Recycle Bottle, " +
    "Recycle Bottle]"
  refrigerator.map { it.recycle2() } eq
    "[Recycle Steel, Recycle Aluminum, " +
    "Recycle Glass, " +
    "Recycle PET, Recycle HDPE]"
}
