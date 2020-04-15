// LambdaWithReceiver/BuildString.kt
package buildstring
import atomictest.eq

fun main() {
  buildString {
    this.append("Alphabet: ")     // [1]
    for (ch in 'a'..'z') {
      append(ch)                  // [2]
    }
  } eq
    "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
