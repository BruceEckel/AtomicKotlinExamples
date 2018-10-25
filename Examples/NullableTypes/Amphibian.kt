// NullableTypes/Amphibian.kt

interface Amphibian

class Frog: Amphibian

enum class Species {
  Frog, Toad, Salamander, Caecilian
}

fun main() {
  val a1 : Amphibian = Frog()
  val a2 : Amphibian? = null
  val f1 : Frog = Frog()
  val f2 : Frog? = null
  val at1 : Species = Species.Toad
  val at2 : Species? = null
}
