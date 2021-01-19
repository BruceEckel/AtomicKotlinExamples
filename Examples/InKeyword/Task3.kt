// InKeyword/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package theInKeywordExercise3

fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}
