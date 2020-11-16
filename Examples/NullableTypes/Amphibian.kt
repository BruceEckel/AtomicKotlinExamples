// NullableTypes/Amphibian.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package nullabletypes

class Amphibian

enum class Species {
  Frog, Toad, Salamander, Caecilian
}

fun main() {
  val a1: Amphibian = Amphibian()
  val a2: Amphibian? = null
  val at1: Species = Species.Toad
  val at2: Species? = null
}
