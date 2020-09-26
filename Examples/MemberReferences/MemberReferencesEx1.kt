// MemberReferences/MemberReferencesEx1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package memberReferencesExercise1
import atomictest.eq
import memberReferencesExercise1.Habitat.*

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

fun List<Pet>.liveOnLand(): List<Pet> =
  filter(LAND::livesIn)

fun List<Pet>.liveInWater(): List<Pet> =
  filter(WATER::livesIn)

fun List<Pet>.areAmphibious(): List<Pet> =
  filter(AMPHIBIOUS::livesIn)

fun List<Pet>.partAmphibious(): Pair<List<Pet>, List<Pet>> =
  partition(AMPHIBIOUS::livesIn)

fun main() {
  val pets = listOf(
    Pet("Dog", LAND),
    Pet("Cat", LAND),
    Pet("Goldfish", WATER),
    Pet("Turtle", AMPHIBIOUS),
    Pet("Frog", AMPHIBIOUS)
  )
  pets.liveOnLand() eq "[Dog, Cat]"
  pets.liveInWater() eq "[Goldfish]"
  pets.areAmphibious() eq "[Turtle, Frog]"
  pets.partAmphibious() eq
    "([Turtle, Frog], [Dog, Cat, Goldfish])"
}
