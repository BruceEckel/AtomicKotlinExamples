// LateInitialization/LateInitSoln3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package lateinitializationsoln3
import atomictest.*

data class Generator(val id: Int)

class Turbine(val id: Int) {
  private lateinit var _generator: Generator
  val generator: Generator
    get() {
      if(!::_generator.isInitialized)
        _generator = Generator(id)
      return _generator
    }
  override fun toString() =
    "Generator $id running: " +
    "${::_generator.isInitialized}"
}

class PowerPlant(nTurbines: Int = 4) {
  private val turbines: List<Turbine> =
    List(nTurbines) { Turbine(it) }
  fun generator(number: Int): Generator {
    require(number in 0..turbines.size)
    return turbines[number].generator
  }
  fun status() = turbines.forEach {
    trace(it.toString())
  }
}

fun main() {
  val plant = PowerPlant()
  plant.status()
  trace(plant.generator(1))
  trace(plant.generator(3))
  plant.status()
  trace eq """
    Generator 0 running: false
    Generator 1 running: false
    Generator 2 running: false
    Generator 3 running: false
    Generator(id=1)
    Generator(id=3)
    Generator 0 running: false
    Generator 1 running: true
    Generator 2 running: false
    Generator 3 running: true
  """
}
