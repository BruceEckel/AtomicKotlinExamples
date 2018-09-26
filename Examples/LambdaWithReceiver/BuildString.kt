// LambdaWithReceiver/BuildString.kt
import atomictest.eq

fun main() {
  buildString {
    append("Alphabet: ")
    for (ch in 'a'..'z')
      append(ch)
  } eq
  "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
