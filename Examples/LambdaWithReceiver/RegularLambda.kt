// LambdaWithReceiver/RegularLambda.kt
package regularlambda
import atomictest.eq

fun buildStr(
  builderAction: (StringBuilder) -> Unit
): String {
  val sb = StringBuilder()
  builderAction(sb)
  return sb.toString()
}

fun main(args: Array<String>) {
  buildStr { sb ->
    sb.append("Alphabet: ")
    for (ch in 'a'..'z')
      sb.append(ch)
  } eq "Alphabet: abcdefghijklmnopqrstuvwxyz"
}
