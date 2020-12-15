// Tests/unittesting/UnitTestingSoln3.kt
package unitTestingExercise3
import classdelegation.SpaceShipControls
import kotlin.test.*

infix fun <T> T.aeq(actual: T) =
  assertEquals(this, actual)

class SpaceShipControlsTest {
  val velocity = 10
  val controls = SpaceShipControls()
  init { println("init") }
  @Test
  fun up() {
    "up 10" aeq controls.up(velocity)
  }
  @Test
  fun down() {
    "down 10" aeq controls.down(velocity)
  }
  @Test
  fun left() {
    "left 10" aeq controls.left(velocity)
  }
  @Test
  fun right() {
    "right 10" aeq controls.right(velocity)
  }
  @Test
  fun forward() {
    "forward 10" aeq controls.forward(velocity)
  }
  @Test
  fun back() {
    "back 10" aeq controls.back(velocity)
  }
  @Test
  fun turboBoost() {
    "turbo boost" aeq controls.turboBoost()
  }
}
