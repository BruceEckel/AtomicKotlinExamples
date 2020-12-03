// NonNullAssertions/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nonNullAssertionsExercise1
import atomictest.*

class Rocket {
  fun ignition() = "Liftoff!"
}

fun launch(rocket: Rocket?) = rocket!!.ignition()

fun main() {
  val rocket = Rocket()
  launch(rocket) eq "Liftoff!"
  capture {
    launch(null)
  } eq "NullPointerException"
}
