// ExtensionLambdas/ExtensionLambdasSoln1.kt
package extensionlambdasoln1

fun createString(
  build: StringBuilder.() -> Unit
): String {
  val sb = StringBuilder()
  sb.build()
  return sb.toString()
}

fun main() {
}
