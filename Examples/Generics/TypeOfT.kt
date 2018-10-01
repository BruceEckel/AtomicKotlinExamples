// Generics/TypeOfT.kt
package generics
import atomictest.eq

fun <T> typeOfT(arg: T) = when(arg) {
  is Auto   -> "$arg: Auto"
  is Int    -> "$arg: Int"
  is String -> "$arg: String"
  else      -> "???"
}

fun main() {
  typeOfT(Auto()) eq "Auto(name=Car): Auto"
  typeOfT(1) eq "1: Int"
  typeOfT("Morty") eq "Morty: String"
}
