// Sequences/InputLines2.kt

fun main() {
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
