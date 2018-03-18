// ExtensionFunctions/Quote.kt
package other
import atomictest.eq
import quoting.doubleQuote
import quoting.singleQuote

fun main(args: Array<String>) {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
