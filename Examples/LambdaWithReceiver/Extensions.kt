// LambdaWithReceiver/Extensions.kt
package lambdawithreceiver

fun StringBuilder.appendAlphabet() {
  this.append("Alphabet:")   // Explicit
  for (ch in 'a'..'z')
    append(ch)               // Implicit
}
