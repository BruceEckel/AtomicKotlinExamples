// LoopingAndRanges/HasChar.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun hasChar(s: String, ch: Char): Boolean {
  for (c in s) {
    if (c == ch) return true
  }
  return false
}

fun main() {
  println(hasChar("kotlin", 't'))
  println(hasChar("kotlin", 'a'))
}
/* Output:
true
false
*/
