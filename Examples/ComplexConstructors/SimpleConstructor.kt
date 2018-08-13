// ComplexConstructors/SimpleConstructor.kt
package complexconstructors
import atomictest.eq

class Alien(val name: String)

fun main(args: Array<String>) {
  val alien = Alien("Pencilvester")
  alien.name eq "Pencilvester"
}
