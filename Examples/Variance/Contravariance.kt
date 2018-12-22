// Variance/Contravariance.kt
package variance

interface MallardString {
  fun string(s: Mallard): String
}

interface DuckString : MallardString {
  /* override */ fun string(s: Duck): String
}

fun main() {}
