// InheritanceExtensions/InheritAdd.kt
package inheritanceextensions
import atomictest.eq

open class Heater {
  fun heat(temperature: Int) =
    "heating to $temperature"
}

class HVAC : Heater() {
  fun cool(temperature: Int) =
    "cooling to $temperature"
}

fun warm(heater: Heater) {
  heater.heat(70) eq "heating to 70"
}

fun warmAndCool(hvac: HVAC) {
  hvac.heat(70) eq "heating to 70"
  hvac.cool(60) eq "cooling to 60"
}

fun main() {
  val heater = Heater()
  val hvac = HVAC()
  warm(heater)
  warm(hvac)
  warmAndCool(hvac)
}
