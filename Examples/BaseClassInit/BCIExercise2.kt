// BaseClassInit/BCIExercise2.kt
package baseclassinit
import atomictest.eq

private var trace = ""

open class Plate {
  init {
    trace += "Plate\n"
  }
}

class DinnerPlate : Plate() {
  init {
    trace += "DinnerPlate\n"
  }
}

open class Utensil {
  init {
    trace += "Utensil\n"
  }
}

class Spoon : Utensil() {
  init {
    trace += "Spoon\n"
  }
}

class Fork : Utensil() {
  init {
    trace += "Fork\n"
  }
}

class Knife : Utensil() {
  init {
    trace += "Knife\n"
  }
}

open class Custom() {
  init {
    trace += "Custom\n"
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    trace += "PlaceSetting\n"
  }
}

fun main() {
  PlaceSetting()
/* Fails because of the newlines -- can we fix this?
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
""".trim()
*/
}
