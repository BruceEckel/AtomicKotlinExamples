// Sequences/InputLines2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

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
