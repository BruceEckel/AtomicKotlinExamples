// Sequences/InputLines1.kt

fun main() {
  val lines = generateSequence {
    val line = readLine()
    if (line != "XXX") line else null
  }
  println(lines.toList())
}
/* Input/Output:
>>> first
>>> second
>>> XXX
[first, second]
*/
