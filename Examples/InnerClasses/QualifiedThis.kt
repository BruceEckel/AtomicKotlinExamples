// InnerClasses/QualifiedThis.kt
package innerclasses
import atomictest.eq
import typechecking.name

class Fruit { // implicit label @Fruit
  fun changeColor(color: String) =
    "Fruit $color"
  fun absorbWater(amount: Int) {}
  inner class Seed { // implicit label @Seed
    fun changeColor(color: String) =
      "Seed $color"
    fun germinate() {}
    fun whichThis() {
      // Defaults to the current class:
      this.name eq "Seed"
      // To clarify, you can redundantly
      // qualify the default this:
      this@Seed.name  eq "Seed"
      // Must explicitly access Fruit:
      this@Fruit.name  eq "Fruit"
      // Cannot access a further-inner class:
      // this@DNA.name
    }
    inner class DNA { // implicit label @DNA
      fun changeColor(color: String) {
        // changeColor(color) // Recursive
        this@Seed.changeColor(color)
        this@Fruit.changeColor(color)
      }
      fun plant() {
        // Call outer-class functions
        // Without qualification:
        germinate()
        absorbWater(10)
      }
      // Extension function:
      fun Int.grow() { // Implicit label @grow
        // Default is the Int.grow() receiver:
        this.name eq "Int"
        // Redundant qualification:
        this@grow.name  eq "Int"
        // You can still access everything:
        this@DNA.name  eq "DNA"
        this@Seed.name  eq "Seed"
        this@Fruit.name  eq "Fruit"
      }
      // Extension functions on outer classes:
      fun Seed.plant() {}
      fun Fruit.plant() {}
      fun whichThis() {
        // Defaults to the current class:
        this.name eq "DNA"
        // Redundant qualification:
        this@DNA.name  eq "DNA"
        // The others must be explicit:
        this@Seed.name  eq "Seed"
        this@Fruit.name  eq "Fruit"
      }
    }
  }
}

// Extension function:
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
  seed.whichThis()
  val dna = seed.DNA()
  dna.plant()
  dna.grow(5)
  dna.whichThis()
  dna.changeColor("Purple")
}
