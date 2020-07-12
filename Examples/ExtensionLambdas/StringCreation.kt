// ExtensionLambdas/StringCreation.kt
package extensionlambdas
import atomictest.eq

fun main() {
  val built = StringBuilder()   // [1]
  built.append("ABCs: ")
  for (ch in 'a'..'z')
    built.append(ch)
  built.toString() eq           // [2]
    "ABCs: abcdefghijklmnopqrstuvwxyz"

  buildString {
    append("ABCs: ")
    for (ch in 'a'..'z')
      append(ch)
  } eq built.trim()
}
