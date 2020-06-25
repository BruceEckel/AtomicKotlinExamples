// TypeChecking/BeverageContainer.kt
package typechecking
import atomictest.eq

interface BeverageContainer {
  fun open(): String
  fun pour(): String
}

class Can: BeverageContainer {
  override fun open() = "Pop Top"
  override fun pour() = "Can: Pour"
}

open class Bottle: BeverageContainer {
  override fun open() = "Remove Cap"
  override fun pour() = "Bottle: Pour"
}

class GlassBottle: Bottle()
class PlasticBottle: Bottle()

fun BeverageContainer.recycle() =
  when(this) {
    is Can -> "Recycle Can"
    is GlassBottle -> "Recycle Glass"
    else -> "Landfill"
  }

fun main() {
  val refrigerator = listOf(
    Can(), GlassBottle(), PlasticBottle()
  )
  refrigerator.map { it.open() } eq
    "[Pop Top, Remove Cap, Remove Cap]"
  refrigerator.map { it.recycle() } eq
    "[Recycle Can, Recycle Glass, " +
    "Landfill]"
}
