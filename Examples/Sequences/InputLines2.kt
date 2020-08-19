// Sequences/InputLines2.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package usingsequences

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
