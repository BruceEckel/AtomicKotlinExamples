// ScopeFunctions/ScopeFuncSoln1.kt
package scopefuncsoln1
import classdelegation.SpaceShipControls
import atomictest.*

fun main() {
  with(SpaceShipControls()) {
    trace(forward(1))
    trace(right(1))
    trace(down(1))
    this
  }.let {
    trace(it.forward(2))
    trace(it.right(2))
    trace(it.down(2))
    it
  }.run {
    trace(forward(3))
    trace(right(3))
    trace(down(3))
    this
  }.apply {
    trace(forward(4))
    trace(right(4))
    trace(down(4))
  }.also {
    trace(it.forward(5))
    trace(it.right(5))
    trace(it.down(5))
  }
  trace eq """
    forward 1
    right 1
    down 1
    forward 2
    right 2
    down 2
    forward 3
    right 3
    down 3
    forward 4
    right 4
    down 4
    forward 5
    right 5
    down 5
  """
}
