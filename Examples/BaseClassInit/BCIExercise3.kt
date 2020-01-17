// BaseClassInit/BCIExercise3.kt
package baseclassinit
import atomictest.*

private val trace = Trace()

open class Plate1(i: Int) {
  init {
    trace("Plate $i")
  }
}

class DinnerPlate1(i: Int) : Plate1(i) {
  init {
    trace("DinnerPlate $i")
  }
}

open class Utensil1(i: Int) {
  init {
    trace("Utensil $i")
  }
}

class Spoon1(i: Int) : Utensil1(i) {
  init {
    trace("Spoon $i")
  }
}

class Fork1(i: Int) : Utensil1(i) {
  init {
    trace("Fork $i")
  }
}

class Knife1(i: Int) : Utensil1(i) {
  init {
    trace("Knife $i")
  }
}

// A cultural way of doing something:
open class Custom1(i: Int) {
  init {
    trace("Custom $i")
  }
}

class PlaceSetting1(i: Int) : Custom1(i) {
  val spoon = Spoon1(i)
  val fork = Fork1(i)
  val knife = Knife1(i)
  val plate = DinnerPlate1(i)
  init {
    trace("PlaceSetting $i")
  }
}

fun main() {
  PlaceSetting1(9)
  trace eq """
    Custom 9
    Utensil 9
    Spoon 9
    Utensil 9
    Fork 9
    Utensil 9
    Knife 9
    Plate 9
    DinnerPlate 9
    PlaceSetting 9
  """
}
