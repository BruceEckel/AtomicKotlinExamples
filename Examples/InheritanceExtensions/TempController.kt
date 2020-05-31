// InheritanceExtensions/TempController.kt
package inheritanceextensions
import atomictest.*

private val trace = Trace()

class TempController(
  val current: Double,
  val target: Double
)

fun TempController.heat() {
  if (current < target)
    trace("heating to $target")
}

fun TempController.cool() {
  if (current > target)
    trace("cooling to $target")
}

fun adjust(deltaT: TempController) {
  deltaT.heat()
  deltaT.cool()
}

fun main() {
  adjust(TempController(60.0, 70.0))
  adjust(TempController(80.0, 60.0))
  trace eq """
  heating to 70.0
  cooling to 60.0
  """
}
