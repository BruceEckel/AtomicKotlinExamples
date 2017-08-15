// extensionFunctions/StrangeQuote.kt
import atomicTest.eq
import quoting.singleQuote

fun String.strangeQuote() =
    singleQuote().singleQuote()   // [1]

fun main(args: Array<String>) {
  "Hi".strangeQuote() eq "''Hi''" // Two single quotes
}
