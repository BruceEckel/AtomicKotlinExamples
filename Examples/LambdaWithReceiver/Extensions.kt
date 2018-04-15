// LambdaWithReceiver/Extensions.kt
package lambdawithreceiver

fun StringBuilder.appendAlphabet() {
  this.appendln("Alphabet:")   // [1]
  for (ch in 'a'..'z')
    append(ch)                 // [2]
}
