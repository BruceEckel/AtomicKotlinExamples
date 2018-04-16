// MoreLibraryFunctions/InputLines2.kt

fun main(args: Array<String>) {
  val lines = generateSequence {
    readLine()?.takeIf { it != "XXX" }
  }
  println(lines.toList())
}
/* Input/Output:
>>> first
>>> second
>>> XXX
[first, second]
*/
