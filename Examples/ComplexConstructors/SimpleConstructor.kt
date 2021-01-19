// ComplexConstructors/SimpleConstructor.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package complexconstructors
import atomictest.eq

class Alien(val name: String)

fun main() {
  val alien = Alien("Pencilvester")
  alien.name eq "Pencilvester"
}
