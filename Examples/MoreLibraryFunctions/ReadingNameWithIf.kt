// MoreLibraryFunctions/ReadingNameWithIf.kt
fun main(args: Array<String>) {
  println("Put in your name:")
  val line = readLine()
  if (line?.isNotBlank() == true) {
    println("Your name is: $line")
  }
}
/* Input/Output:
Put in your name:
>>> Sveta
Your name is: Sveta
*/
