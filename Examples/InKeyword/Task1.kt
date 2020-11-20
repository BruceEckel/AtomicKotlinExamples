// InKeyword/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package theInKeywordExercise1

fun getAlphabet(): String {
  var s = ""
  for (c in 'a'..'z') {
    s += c
  }
  return s
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
