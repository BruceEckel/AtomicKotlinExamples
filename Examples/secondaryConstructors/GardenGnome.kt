// SecondaryConstructors/GardenGnome.kt
import atomictest.eq

class GardenGnome(
  val height: Double,
  val weight: Double,
  var happy: Boolean
) {
  init {
    println("In primary constructor")
  }
  var painted = true
  fun magic(level: Int) = "Poof! $level"
  constructor(height: Double) :       // [1]
    this(height, 100.0, true)
  constructor(happy: Boolean) : this(15.0) {
    this.happy = happy                // [2]
  }
  fun show() =
    "$height $weight $happy $painted"
}

fun main(args: Array<String>) {
  GardenGnome(20.0, 110.0, false).show() eq
    "20.0 110.0 false true"
  GardenGnome(happy = true).show() eq
    "15.0 100.0 true true"
}
/* Output:
In primary constructor
20.0 110.0 false true
In primary constructor
15.0 100.0 true true
*/
