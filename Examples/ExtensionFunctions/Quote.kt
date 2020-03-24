// ExtensionFunctions/Quote.kt
package other
import atomictest.eq
import quoting.doubleQuote
import quoting.singleQuote

fun main() {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
