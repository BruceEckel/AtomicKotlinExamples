// InheritanceExtensions/TemperatureDelta.kt
package inheritanceextensions
import atomictest.*

class TemperatureDelta(
  val current: Double,
  val target: Double
)

fun TemperatureDelta.heat() {
  if (current < target)
    trace("heating to $target")
}

fun TemperatureDelta.cool() {
  if (current > target)
    trace("cooling to $target")
}

fun adjust(deltaT: TemperatureDelta) {
  deltaT.heat()
  deltaT.cool()
}

fun main() {
  adjust(TemperatureDelta(60.0, 70.0))
  adjust(TemperatureDelta(80.0, 60.0))
  trace eq """
    heating to 70.0
    cooling to 60.0
  """
}
