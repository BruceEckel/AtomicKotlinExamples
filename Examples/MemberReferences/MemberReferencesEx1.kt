// MemberReferences/MemberReferencesEx1.kt
package memberreferencesex1
import atomictest.eq
import memberreferencesex1.Habitat.*

data class Pet(
  var name: String,
  val habitat: Habitat
) {
  override fun toString() = name
}

enum class Habitat {
  LAND, WATER, AMPHIBIOUS;
  fun livesIn(pet: Pet) = pet.habitat == this
}

fun main() {
  val pets = listOf(
    Pet("Dog", LAND),
    Pet("Cat", LAND),
    Pet("Goldfish", WATER),
    Pet("Turtle", AMPHIBIOUS),
    Pet("Frog", AMPHIBIOUS)
  )
  pets.filter(LAND::livesIn) eq
    "[Dog, Cat]"
  pets.filter(WATER::livesIn) eq
    "[Goldfish]"
  pets.filter(AMPHIBIOUS::livesIn) eq
    "[Turtle, Frog]"
  pets.partition(AMPHIBIOUS::livesIn) eq
    "([Turtle, Frog], [Dog, Cat, Goldfish])"
}
