// Sequences/InputLines1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

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
