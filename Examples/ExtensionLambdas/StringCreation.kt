// ExtensionLambdas/StringCreation.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

private fun messy(): String {
  val built = StringBuilder()      // [1]
  built.append("ABCs: ")
  ('a'..'z').forEach { built.append(it) }
  return built.toString()          // [2]
}

private fun clean() = buildString {
  append("ABCs: ")
  ('a'..'z').forEach { append(it) }
}

private fun cleaner() =
  "ABCs: " + ('a'..'z').fold("", String::plus)

fun main() {
  messy() eq clean()
  clean() eq cleaner()
}
