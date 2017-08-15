// inheritance/GreatApe.kt
package inheritance
import atomicTest.eq

open class GreatApe {
  val weight = 100.0
  val age = 12
}

open class Bonobo : GreatApe()
class Chimpanzee : GreatApe()
class BonoboB : Bonobo()

fun display(ape: GreatApe) =
    "weight: ${ape.weight} age: ${ape.age}"

fun main(args: Array<String>) {
  display(GreatApe()) eq
      "weight: 100.0 age: 12"
  display(Bonobo()) eq
      "weight: 100.0 age: 12"
  display(Chimpanzee()) eq
      "weight: 100.0 age: 12"
  display(BonoboB()) eq
      "weight: 100.0 age: 12"
}
