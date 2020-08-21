// ExtensionFunctions/Quoting.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package quoting
import atomictest.eq

fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

fun main() {
  "Hi".singleQuote() eq "'Hi'"
  "Hi".doubleQuote() eq "\"Hi\""
}
