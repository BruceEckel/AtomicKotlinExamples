// Variance/Contravariance.kt
package variance

interface MallardString {
  fun string(b: Mallard): String
}

interface DuckString : MallardString {
  /* override */ fun string(b: Duck): String
}

interface BirdString : DuckString {
  /* override */ fun string(b: Bird): String
}

fun makeString(bs: BirdString) {
  bs.string(Mallard())
  bs.string(Duck())
  bs.string(Bird())
}

fun main() {}
