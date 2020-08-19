// SecondaryConstructors/GardenItem.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package secondaryconstructors
import atomictest.eq
import secondaryconstructors.Material.*

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenItem(val name: String) {
  var material: Material = Plastic
  constructor(
    name: String, material: Material     // [1]
  ) : this(name) {                       // [2]
    this.material = material             // [3]
  }
  constructor(
    material: Material
  ) : this("Strange Thing", material)    // [4]
  override fun toString() = "$material $name"
}

fun main() {
  GardenItem("Elf").material eq Plastic
  GardenItem("Snowman").name eq "Snowman"
  GardenItem("Gazing Ball", Metal) eq    // [5]
    "Metal Gazing Ball"
  GardenItem(material = Ceramic) eq
    "Ceramic Strange Thing"
}
