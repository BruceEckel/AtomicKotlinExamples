// LambdaWithReceiver/BuildStringDef.kt
package buildstring

fun buildString(
  builderAction: StringBuilder.() -> Unit
): String {
  val sb = StringBuilder()
  sb.builderAction()        // [1]
  return sb.toString()
}
