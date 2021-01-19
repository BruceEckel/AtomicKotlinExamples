// ExtensionFunctions/Quote.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package other
import atomictest.eq
import extensionfunctions.doubleQuote
import extensionfunctions.singleQuote

fun main() {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
