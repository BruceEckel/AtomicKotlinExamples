// NestedAndInnerClasses/QualifiedThis.kt
package nestedinner
import atomictest.eq

class Fruit { // implicit label @Fruit
  inner class Seed { // implicit label @Seed
    inner class DNA { // implicit label @DNA
      fun f() {
        // Default is the Int ext() receiver:
        which(this) eq "DNA"
        // You can redundantly qualify it:
        which(this@DNA) eq "DNA"
        // The others must be explicit:
        which(this@Seed) eq "Seed"
        which(this@Fruit) eq "Fruit"
      }
      fun Int.ext() { // implicit label @ext
        // Default is the Int ext() receiver:
        which(this) eq "Int"
        // You can redundantly qualify it:
        which(this@ext) eq "Int"
      }
    }
  }
}

fun Fruit.Seed.DNA.extension(n: Int) = n.ext()

fun main() {
  val fruit = Fruit()
  val seed = fruit.Seed()
  val dna = seed.DNA()
  dna.f()
  dna.extension(5)
}
