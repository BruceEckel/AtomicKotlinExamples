// MoreLibraryFunctions/ReadingName.kt
fun main(args: Array<String>) {
  println("Put in your name:")
  readLine()
    ?.takeUnless { it.isBlank() }
    ?.let { println("Your name is: $it") }
}
/* Input/Output:
Put in your name:
>>> Sveta
Your name is: Sveta
*/
