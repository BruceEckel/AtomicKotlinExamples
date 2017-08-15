// baseClassInitialization/GreatApe2.kt
package baseclassinit
import atomicTest.eq

open class GreatApe(
    val weight: Double,
    val age: Int
)

open class Bonobo(
    weight: Double,
    age: Int
) : GreatApe(weight, age)

class Chimpanzee(
    weight: Double,
    age: Int
) : GreatApe(weight, age)

class BonoboB(
    weight: Double,
    age: Int
) : Bonobo(weight, age)

fun display(ape: GreatApe) =
    "weight: ${ape.weight} age: ${ape.age}"

fun main(args: Array<String>) {
  display(GreatApe(100.0, 12)) eq
      "weight: 100.0 age: 12"
  display(Bonobo(100.0, 12)) eq
      "weight: 100.0 age: 12"
  display(Chimpanzee(100.0, 12)) eq
      "weight: 100.0 age: 12"
  display(BonoboB(100.0, 12)) eq
      "weight: 100.0 age: 12"
}
