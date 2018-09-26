// Inheritance/GreatApe.kt
package inheritance
import atomictest.eq

open class GreatApe {
  val weight = 100.0
  val age = 12
}

open class Bonobo : GreatApe()
class Chimpanzee : GreatApe()
class BonoboB : Bonobo()

fun info(ape: GreatApe) =
  "weight: ${ape.weight} age: ${ape.age}"

fun main() {
  info(GreatApe()) eq
    "weight: 100.0 age: 12"
  info(Bonobo()) eq
    "weight: 100.0 age: 12"
  info(Chimpanzee()) eq
    "weight: 100.0 age: 12"
  info(BonoboB()) eq
    "weight: 100.0 age: 12"
}
