// LambdaWithReceiver/StringBuilder.kt
package lambdawithreceiver
import atomictest.eq

fun main() {
  val stringBuilder = StringBuilder()  // [1]
  stringBuilder.append("Alphabet: ")   // [2]
  for (ch in 'a'..'z') {
    stringBuilder.append(ch)           // [3]
  }
  stringBuilder.toString() eq          // [4]
    "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
