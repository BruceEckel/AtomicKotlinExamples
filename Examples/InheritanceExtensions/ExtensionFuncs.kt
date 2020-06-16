// InheritanceExtensions/ExtensionFuncs.kt
package inheritanceextensions2
import inheritanceextensions.Heater
import atomictest.eq

fun Heater.cool(temperature: Int) =
  "cooling to $temperature"

fun warmAndCool(heater: Heater) {
  heater.heat(70) eq "heating to 70"
  heater.cool(60) eq "cooling to 60"
}

fun main() {
  val heater = Heater()
  warmAndCool(heater)
}
