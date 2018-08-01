// LambdaWithReceiver/BuildString.kt
import atomictest.eq

fun main(args: Array<String>) {
  buildString {
    append("Alphabet: ")
    for (ch in 'a'..'z')
      append(ch)
  } eq
  "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
