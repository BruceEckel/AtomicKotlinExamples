// classDelegation/SpaceShipControls.kt
interface SpaceShipControls {
  fun up(velocity: Int): String
  fun down(velocity: Int): String
  fun left(velocity: Int): String
  fun right(velocity: Int): String
  fun forward(velocity: Int): String
  fun back(velocity: Int): String
  fun turboBoost(): String
}

class SpaceShipControlsImpl: SpaceShipControls {
  override fun up(velocity: Int) = "up $velocity"
  override fun down(velocity: Int) = "down $velocity"
  override fun left(velocity: Int) = "left $velocity"
  override fun right(velocity: Int) = "right $velocity"
  override fun forward(velocity: Int) = "forward $velocity"
  override fun back(velocity: Int) = "back $velocity"
  override fun turboBoost() = "turbo boost"
}
