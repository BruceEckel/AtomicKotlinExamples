// SecondaryConstructors/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package secondaryConstructorsExercise3
import atomictest.eq
import secondaryConstructorsExercise3.Material.*

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenItem(
  val name: String = "Strange Thing",
  val material: Material = Plastic
) {
  override fun toString() = "$material $name"
}

fun main() {
  GardenItem("Elf").material eq Plastic
  GardenItem("Snowman").name eq "Snowman"
  GardenItem("Gazing Ball", Metal) eq
    "Metal Gazing Ball"
  GardenItem(material = Ceramic) eq
    "Ceramic Strange Thing"
}
