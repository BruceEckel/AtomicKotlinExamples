// Erasure/TypeOfT.kt
package generics
import atomictest.eq

fun <T> typeOfT(arg: T) =
  "$arg: " + when(arg) {
  is Car    -> "Car"
  is Int    -> "Int"
  is String -> "String"
  else      -> "${(arg?:"")::class}"
}

data class Alien(
  val n:String = "Pibbles")

fun main() {
  typeOfT(Car()) eq "Car(name=Car): Car"
  typeOfT(1) eq "1: Int"
  typeOfT("Morty") eq "Morty: String"
  typeOfT(Alien()) eq
    "Alien(n=Pibbles): class generics.Alien"
}
