// ClassDelegation/DelegatedControls.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package classdelegation
import atomictest.eq

class DelegatedControls(
  private val controls: SpaceShipControls =
    SpaceShipControls()
): Controls by controls {
  override fun turboBoost(): String =
    "${controls.turboBoost()}... boooooost!"
}

fun main() {
  val controls = DelegatedControls()
  controls.forward(100) eq "forward 100"
  controls.turboBoost() eq
    "turbo boost... boooooost!"
}
