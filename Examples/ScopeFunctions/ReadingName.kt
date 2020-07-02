// ScopeFunctions/ReadingName.kt
package scopefunctions

fun main() {
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
