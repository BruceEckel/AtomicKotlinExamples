// Abstract/Gadget.kt
import atomictest.eq

interface Gadget {
  val model: String
  val productionYear: Int

  val isOutdated: Boolean
    get() = productionYear < 2050

  fun isOverpriced() =
    model.startsWith("i")
}

class MyGadget(
  override val model: String,
  override val productionYear: Int
) : Gadget

fun main(args: Array<String>) {
  val gadget: Gadget =
    MyGadget("my first phone", 2000)
  gadget.isOutdated eq true
  gadget.isOverpriced() eq false
}
