// BaseClassInit/GreatApe3.kt
package baseclassinit
import atomictest.eq

open class GreatApe(
  val weight: Double,
  val age: Int
)

open class Bonobo(weight: Double, age: Int):
  GreatApe(weight, age)

class Chimpanzee(weight: Double, age: Int):
  GreatApe(weight, age)

class BonoboB(weight: Double, age: Int):
  Bonobo(weight, age)

fun info(ape: GreatApe) =
  "weight: ${ape.weight} age: ${ape.age}"

fun main() {
  info(GreatApe(100.0, 12)) eq
    "weight: 100.0 age: 12"
  info(Bonobo(110.0, 13)) eq
    "weight: 110.0 age: 13"
  info(Chimpanzee(120.0, 14)) eq
    "weight: 120.0 age: 14"
  info(BonoboB(130.0, 15)) eq
    "weight: 130.0 age: 15"
}
