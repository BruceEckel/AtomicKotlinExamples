// classDelegation/ExplicitDelegation.kt
import atomicTest.eq

class AdjustedControlsExplicit : SpaceShipControls {

  private val controls = SpaceShipControlsImpl()

  // Delegated members:

  override fun up(velocity: Int) =
      controls.up(velocity)

  override fun back(velocity: Int) =
      controls.back(velocity)

  override fun down(velocity: Int) =
      controls.down(velocity)

  override fun forward(velocity: Int) =
      controls.forward(velocity)

  override fun left(velocity: Int) =
      controls.left(velocity)

  override fun right(velocity: Int) =
      controls.right(velocity)
      
  // Modified implementations:    

  override fun turboBoost(): String =
      controls.turboBoost() + "... boooooost!"
}

fun main(args: Array<String>) {
  val controls = AdjustedControlsExplicit()
  controls.forward(100) eq "forward 100"
  controls.turboBoost() eq "turbo boost... boooooost!"
}
