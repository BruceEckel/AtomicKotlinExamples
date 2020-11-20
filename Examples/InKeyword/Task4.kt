// InKeyword/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theInKeywordExercise4

fun isValidCharacter(ch: Char): Boolean = ch == '_' ||
  ch in 'a'..'z' || ch in 'A'..'Z' ||
  ch in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty() || s[0] in '0'..'9') return false
  for (ch in s) {
    if (!isValidCharacter(ch)) return false
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}
