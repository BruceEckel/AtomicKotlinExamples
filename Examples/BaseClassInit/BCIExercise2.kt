// BaseClassInit/BCIExercise2.kt
package baseclassinit
import atomictest.*

private val trace = Trace()

open class Plate {
  init {
    trace("Plate")
  }
}

class DinnerPlate : Plate() {
  init {
    trace("DinnerPlate")
  }
}

open class Utensil {
  init {
    trace("Utensil")
  }
}

class Spoon : Utensil() {
  init {
    trace("Spoon")
  }
}

class Fork : Utensil() {
  init {
    trace("Fork")
  }
}

class Knife : Utensil() {
  init {
    trace("Knife")
  }
}

open class Custom() {
  init {
    trace("Custom")
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    trace("PlaceSetting")
  }
}

fun main() {
  PlaceSetting()
  trace eq """
    Custom
    Utensil
    Spoon
    Utensil
    Fork
    Utensil
    Knife
    Plate
    DinnerPlate
    PlaceSetting
  """
}
