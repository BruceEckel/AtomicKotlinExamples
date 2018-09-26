// LocalFunctions/LocalExtensions.kt
import atomictest.eq

fun main() {
  fun String.exclaim() = "$this!"
  "Hello".exclaim() eq "Hello!"
  "Hallo".exclaim() eq "Hallo!"
  "Bonjour".exclaim() eq "Bonjour!"
  "Ciao".exclaim() eq "Ciao!"
}
