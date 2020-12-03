// Abstract/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package abstractClassesExercise2
import atomictest.eq

interface Movable {
  fun move() = "move"
}

interface Sleepable {
  fun sleepOn() = "sleep"
}

class Sofa: Movable, Sleepable

fun main() {
  val sofa = Sofa()
  sofa.move() eq "move"
  sofa.sleepOn() eq "sleep"
}
