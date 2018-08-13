// SecondaryConstructors/GardenGnome.kt
package secondaryconstructors
import atomictest.eq

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenGnome(
  val name: String,
  var material: Material
) {
  constructor(name: String) :         // [1]
    this(name, Material.Plastic)

  constructor(material: Material) :
    this("No name") {
    this.material = material          // [2]
}

  override fun toString() = "$material $name"
}

fun main(args: Array<String>) {
  GardenGnome("Snowman") eq "Plastic Snowman"
  GardenGnome("Volan") eq "Plastic Volan"
  GardenGnome(Material.Metal) eq
    "Metal No name"
}
