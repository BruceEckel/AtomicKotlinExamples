// MoreLibraryFunctions/ReadingNameWithIf.kt
fun main(args: Array<String>) {
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
