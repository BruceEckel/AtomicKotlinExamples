// Abstract/Gadget.kt
import atomictest.eq

interface Gadget {
  val model: String
  val productionYear: Int

  fun isOverpriced() =
    model.startsWith("i")

  val isOutdated: Boolean
    get() = productionYear < 2050
}

class MyGadget(
  override val model: String,
  override val productionYear: Int
) : Gadget

fun main() {
  val gadget: Gadget =
    MyGadget("my first phone", 2000)
  gadget.isOutdated eq true
  gadget.isOverpriced() eq false
}
