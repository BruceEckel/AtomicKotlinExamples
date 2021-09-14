// ObjectsEverywhere/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package objectsEverywhereExercise2

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun main() {
  println(isPalIgnoreCase("Mom"))  // true
}
