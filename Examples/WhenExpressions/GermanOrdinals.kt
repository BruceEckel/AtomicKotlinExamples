// WhenExpressions/GermanOrdinals.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package whenexpressions
import atomictest.eq

val numbers = mapOf(
  1 to "eins", 2 to "zwei", 3 to "drei",
  4 to "vier", 5 to "fuenf", 6 to "sechs",
  7 to "sieben", 8 to "acht", 9 to "neun",
  10 to "zehn", 11 to "elf", 12 to "zwoelf",
  13 to "dreizehn", 14 to "vierzehn",
  15 to "fuenfzehn", 16 to "sechzehn",
  17 to "siebzehn", 18 to "achtzehn",
  19 to "neunzehn", 20 to "zwanzig"
)

fun ordinal(i: Int): String =
  when (i) {                            // [1]
    1 -> "erste"                        // [2]
    3 -> "dritte"
    7 -> "siebte"
    8 -> "achte"
    20 -> "zwanzigste"
    else -> numbers.getValue(i) + "te"  // [3]
  }

fun main() {
  ordinal(2) eq "zweite"
  ordinal(3) eq "dritte"
  ordinal(11) eq "elfte"
}
