// extensions/StrangeQuote.kt
import atomicTest.eq
import quoting.singleQuote

// Apply two sets of single quotes:
fun String.strangeQuote() =
  singleQuote().singleQuote()   // [1]

fun main(args: Array<String>) {
  "Hi".strangeQuote() eq "''Hi''"
}
