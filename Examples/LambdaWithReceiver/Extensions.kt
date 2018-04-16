// LambdaWithReceiver/Extensions.kt
package lambdawithreceiver

fun StringBuilder.appendAlphabet() {
  this.append("Alphabet:")     // [1]
  for (ch in 'a'..'z')
    append(ch)                 // [2]
}
