// BaseInit/GreatApe2.kt
package baseclassinit
import atomictest.eq

open class GreatApe(
  val weight: Double,
  val age: Int
)

open class Bonobo(weight: Double, age: Int) :
  GreatApe(weight, age)

class Chimpanzee(weight: Double, age: Int) :
  GreatApe(weight, age)

class BonoboB(weight: Double, age: Int) :
  Bonobo(weight, age)

fun display(ape: GreatApe) =
  "weight: ${ape.weight} age: ${ape.age}"

fun main(args: Array<String>) {
  display(GreatApe(100.0, 12)) eq
    "weight: 100.0 age: 12"
  display(Bonobo(110.0, 13)) eq
    "weight: 110.0 age: 13"
  display(Chimpanzee(120.0, 14)) eq
    "weight: 120.0 age: 14"
  display(BonoboB(130.0, 15)) eq
    "weight: 130.0 age: 15"
}
