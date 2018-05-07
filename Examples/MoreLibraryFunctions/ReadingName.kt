// MoreLibraryFunctions/ReadingName.kt
fun main(args: Array<String>) {
  println("Enter your name:")
  readLine()
    ?.takeUnless { it.isBlank() }
    ?.let { println("Your name is: $it") }
}
/* Input/Output:
Enter your name:
>>> Sveta
Your name is: Sveta
*/
