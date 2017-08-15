// classDelegation/AdjustedControls.kt
import atomicTest.eq

class AdjustedControls(
    private val controls: SpaceShipControls = SpaceShipControlsImpl()
) : SpaceShipControls by controls {

  override fun turboBoost(): String =
      controls.turboBoost() + "... boooooost!"
}

fun main(args: Array<String>) {
  val controls = AdjustedControls()
  controls.forward(100) eq "forward 100"
  controls.turboBoost() eq "turbo boost... boooooost!"
}
