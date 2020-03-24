// LambdaWithReceiver/Declarations.kt
package lambdawithreceiver
import atomictest.eq

fun buildString1(
  builderAction:
    (StringBuilder) -> Unit   // [1]
): String {
  val sb = StringBuilder()
  builderAction(sb)           // [2]
  return sb.toString()
}

fun buildString2(
  builderAction:
    StringBuilder.() -> Unit  // [3]
): String {
  val sb = StringBuilder()
  sb.builderAction()          // [4]
  return sb.toString()
}

fun main() {
  buildString1 {
    it.append("Regular lambda")
  } eq "Regular lambda"

  buildString2 {
    append("Lambda with receiver")
  } eq "Lambda with receiver"
}
