// BaseClassInit/BCIExercise3.kt
package baseclassinit
import atomictest.eq

private var trace = ""

open class Plate1(i: Int) {
  init {
    trace += "Plate $i\n"
  }
}

class DinnerPlate1(i: Int) : Plate1(i) {
  init {
    trace += "DinnerPlate $i\n"
  }
}

open class Utensil1(i: Int) {
  init {
    trace += "Utensil $i\n"
  }
}

class Spoon1(i: Int) : Utensil1(i) {
  init {
    trace += "Spoon $i\n"
  }
}

class Fork1(i: Int) : Utensil1(i) {
  init {
    trace += "Fork $i\n"
  }
}

class Knife1(i: Int) : Utensil1(i) {
  init {
    trace += "Knife $i\n"
  }
}

// A cultural way of doing something:
open class Custom1(i: Int) {
  init {
    trace += "Custom $i\n"
  }
}

class PlaceSetting1(i: Int) : Custom1(i) {
  val spoon = Spoon1(i)
  val fork = Fork1(i)
  val knife = Knife1(i)
  val plate = DinnerPlate1(i)
  init {
    trace += "PlaceSetting $i\n"
  }
}

fun main() {
  PlaceSetting1(9)
/* Fails because of the newlines -- can we fix this?
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
""".trim()
*/
}
