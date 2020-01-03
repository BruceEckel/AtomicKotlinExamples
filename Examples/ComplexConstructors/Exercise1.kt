// ComplexConstructors/Exercise1.kt
package complexconstructors
import atomictest.eq

class Alien2(private val name: String) {
  val myName: String
  init {
    myName = name
  }
}

fun main() {
  val alien = Alien2("Pencilvester")
  alien.myName eq "Pencilvester"
}
