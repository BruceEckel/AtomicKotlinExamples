// ExtensionFunctions/Quote.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package other
import atomictest.eq
import quoting.doubleQuote
import quoting.singleQuote

fun main() {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
