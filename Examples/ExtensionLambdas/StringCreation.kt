// ExtensionLambdas/StringCreation.kt
package extensionlambdas
import atomictest.eq

private fun messy(): String {
  val built = StringBuilder()   // [1]
  built.append("ABCs: ")
  for (ch in 'a'..'z')
    built.append(ch)
  return built.toString()       // [2]
}

private fun clean() =
  buildString {
    append("ABCs: ")
    for (ch in 'a'..'z')
      append(ch)
  }

fun main() {
  messy() eq clean()
}
