// InheritanceExtensions/InhExtensionsEx2.kt
package inheritanceAndExtensionsExercise2
import inheritanceextensions.Heater
import inheritanceextensions.warm
import atomictest.*

class HVAC {
  private val heater = Heater()
  fun heat(temperature: Int) =
    heater.heat(temperature)
  fun cool(temperature: Int) =
    "cooling to $temperature"
}

fun warmAndCool(hvac: HVAC) {
  hvac.heat(70) eq "heating to 70"
  hvac.cool(60) eq "cooling to 60"
}

fun main() {
  val heater = Heater()
  val hvac = HVAC()
  warm(heater)
  // warm(hvac) // Doesn't work
  warmAndCool(hvac)
}
