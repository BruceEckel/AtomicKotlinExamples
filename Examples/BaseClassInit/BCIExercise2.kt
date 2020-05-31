// BaseClassInit/BCIExercise2.kt
package baseClassInitializationExercise2

open class Plate {
  init {
    println("Plate")
  }
}

class DinnerPlate : Plate() {
  init {
    println("DinnerPlate")
  }
}

open class Utensil {
  init {
    println("Utensil")
  }
}

class Spoon : Utensil() {
  init {
    println("Spoon")
  }
}

class Fork : Utensil() {
  init {
    println("Fork")
  }
}

class Knife : Utensil() {
  init {
    println("Knife")
  }
}

open class Custom() {
  init {
    println("Custom")
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    println("PlaceSetting")
  }
}

fun main() {
  PlaceSetting()
}
/* Exercise Output:
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
*/
