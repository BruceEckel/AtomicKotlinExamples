// LambdaWithReceiver/BuildStringAndThis.kt
import atomictest.eq

fun main(args: Array<String>) {
  buildString {
    this.append("Alphabet: ")     // [1]
    for (ch in 'a'..'z')
      append(ch)                  // [2]
  } eq "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
