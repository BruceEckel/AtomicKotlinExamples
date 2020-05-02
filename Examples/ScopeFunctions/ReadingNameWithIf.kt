// ScopeFunctions/ReadingNameWithIf.kt

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
