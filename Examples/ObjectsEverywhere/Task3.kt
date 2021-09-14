// ObjectsEverywhere/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var onlyLetters = ""
  for (ch in s) {
    if (ch in 'a'..'z' || ch in 'A'..'Z') {
      onlyLetters += ch
    }
  }
  return isPalIgnoreCase(onlyLetters)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}
