// ComplexConstructors/SimpleConstructor.kt
package complexconstructors
import atomictest.eq

class Alien(val name: String)

fun main() {
  val alien = Alien("Pencilvester")
  alien.name eq "Pencilvester"
}
