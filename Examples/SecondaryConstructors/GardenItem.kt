// SecondaryConstructors/GardenItem.kt
package secondaryconstructors
import atomictest.eq

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenItem(
  val name: String,
  var material: Material
) {
  constructor(name: String):          // [1]
    this(name, Material.Plastic)
  constructor(material: Material, nm: String):
    this(nm) {
    this.material = material          // [2]
  }
  override fun toString() = "$material $name"
}

fun main() {
  GardenItem("Snowman") eq "Plastic Snowman"
  GardenItem("Elf") eq "Plastic Elf"
  GardenItem(Material.Metal, "Gazing Ball") eq
    "Metal Gazing Ball"
}
