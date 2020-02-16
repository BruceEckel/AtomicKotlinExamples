// InnerClasses/QualifiedThis.kt
package innerclasses
import atomictest.eq

class Fruit { // implicit label @Fruit
  fun absorbWater(amount: Int) {}
  fun changeColor(color: String) =
    "Fruit $color"
  inner class Seed { // implicit label @Seed
    fun germinate() {}
    fun changeColor(color: String) =
      "Seed $color"
    inner class DNA { // implicit label @DNA
      fun whichThis() {
        // Defaults to the current class:
        which(this) eq "DNA"
        // To clarify, you can redundantly
        // qualify the default this:
        which(this@DNA) eq "DNA"
        // The others must be explicit:
        which(this@Seed) eq "Seed"
        which(this@Fruit) eq "Fruit"
      }
      fun plant() {
        // Call outer-class functions
        // Without qualification:
        germinate()
        absorbWater(10)
      }
      fun changeColor(color: String) {
        // changeColor(color) // Recursive
        this@Seed.changeColor(color)
        this@Fruit.changeColor(color)
      }
      // Extension method:
      fun Int.grow() { // Implicit label @grow
        // Default is the Int.grow() receiver:
        which(this) eq "Int"
        // You can redundantly qualify it:
        which(this@grow) eq "Int"
      }
      // Extension functions on outer classes:
      fun Seed.plant() {}
      fun Fruit.plant() {}
    }
  }
}

// Overloaded extension functions:
fun Fruit.grow(amount: Int) {
  absorbWater(amount)
  // Calls Fruit's version of changeColor():
  changeColor("Red") eq "Fruit Red"
}

// Inner-class extension function:
fun Fruit.Seed.grow(n: Int) {
  germinate()
  // Calls Seed's version of changeColor():
  changeColor("Green") eq "Seed Green"
}

// Inner-class extension function:
fun Fruit.Seed.DNA.grow(n: Int) = n.grow()

fun main() {
  val fruit = Fruit()
  fruit.grow(4)
  val seed = fruit.Seed()
  seed.grow(9)
  val dna = seed.DNA()
  dna.plant()
  dna.grow(5)
  dna.whichThis()
  dna.changeColor("Purple")
}
