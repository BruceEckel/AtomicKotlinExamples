// secondaryConstructors/GardenGnome.kt
import atomicTest.eq

class GardenGnome(
    val height: Double,
    val weight: Double,
    val happy: Boolean
) {
  init {
    println("Inside primary constructor")
  }

  var painted = true
  fun magic(level: Int): String = "Poof! " + level

  constructor(height: Double)                // [1]
      : this(height, 100.0, true)

  constructor(name: String) : this(15.0) {   // [2]
    painted eq true
  }

  fun show(): String = "$height $weight $happy $painted"
}

fun main(args: Array<String>) {
  GardenGnome(20.0, 110.0, false).
      show() eq "20.0 110.0 false true"
  GardenGnome("Bob").show() eq
      "15.0 100.0 true true"
}
