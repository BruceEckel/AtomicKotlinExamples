// BaseClassInit/GreatApe3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
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

fun GreatApe.info() = "wt: $weight age: $age"

fun main() {
  GreatApe(100.0, 12).info() eq
    "wt: 100.0 age: 12"
  Bonobo(110.0, 13).info() eq
    "wt: 110.0 age: 13"
  Chimpanzee(120.0, 14).info() eq
    "wt: 120.0 age: 14"
  BonoboB(130.0, 15).info() eq
    "wt: 130.0 age: 15"
}
