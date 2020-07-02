// ScopeFunctions/ReadingNameWithIf.kt
package scopefunctions

fun main() {
  println("Enter your name:")
  val line = readLine()
  if (line?.isNotBlank() == true) {
    println("Your name is: $line")
  }
}
/* Input/Output:
Enter your name:
>>> Sveta
Your name is: Sveta
*/
