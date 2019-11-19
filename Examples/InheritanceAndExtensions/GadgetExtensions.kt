// InheritanceAndExtensions/GadgetExtensions.kt
package inheritanceandextensions2
import atomictest.eq

interface Gadget {
  val model: String
  val productionYear: Int
}

fun Gadget.isOverpriced() =
  model.startsWith("i")

fun Gadget.isOutdated() =
  productionYear < 2050

class MyGadget(
  override val model: String,
  override val productionYear: Int
) : Gadget

fun main() {
  val gadget: Gadget =
    MyGadget("my first phone", 2000)
  gadget.isOutdated() eq true        // [1]
  gadget.isOverpriced() eq false     // [2]
}
