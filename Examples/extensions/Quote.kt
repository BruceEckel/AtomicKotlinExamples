// extensions/Quote.kt
package other
import atomicTest.eq
import quoting.doubleQuote
import quoting.singleQuote

fun main(args: Array<String>) {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
