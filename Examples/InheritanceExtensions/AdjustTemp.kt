// InheritanceExtensions/AdjustTemp.kt
package inheritanceextensions
import atomictest.*

private val trace = Trace()

class DeltaTemperature(
  val current: Double,
  val target: Double
)

fun DeltaTemperature.heat() {
  if (current < target)
    trace("heating to $target ")
}

fun DeltaTemperature.cool() {
  if (current > target)
    trace("cooling to $target ")
}

fun adjust(deltaT: DeltaTemperature) {
  deltaT.heat()
  deltaT.cool()
}

fun main() {
  adjust(DeltaTemperature(60.0, 70.0))
  adjust(DeltaTemperature(80.0, 60.0))
  trace eq """
  heating to 70.0
  cooling to 60.0
  """
}
