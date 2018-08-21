// ClassDelegation/DelegatedControls.kt
import atomictest.eq

class DelegatedControls(
  private val controls: SpaceShipControls =
    SpaceShipControls()
) : ShipControls by controls {
  override fun turboBoost(): String =
    "${controls.turboBoost()}... boooooost!"
}

fun main(args: Array<String>) {
  val controls = DelegatedControls()
  controls.forward(100) eq "forward 100"
  controls.turboBoost() eq
    "turbo boost... boooooost!"
}
