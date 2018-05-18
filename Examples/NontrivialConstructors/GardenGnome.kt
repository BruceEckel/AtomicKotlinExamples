// NontrivialConstructors/GardenGnome.kt
package nontrivialconstructors
import atomictest.eq

class GardenGnome(
  val name: String,
  var crazy: Boolean
) {
  constructor(name: String) :         // [1]
    this(name, name.contains("!"))

  constructor(crazy: Boolean) :
                          this("Who am I?") {
    this.crazy = crazy                // [2]
  }

  override fun toString(): String =
    name +
      if (crazy) " Yes! I'm crazy!" else ""
}

fun main(args: Array<String>) {
  GardenGnome("Snowman") eq "Snowman"
  GardenGnome("Volan!") eq
    "Volan! Yes! I'm crazy!"
  GardenGnome(crazy = true) eq
    "Who am I? Yes! I'm crazy!"
}
