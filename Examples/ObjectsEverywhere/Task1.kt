// ObjectsEverywhere/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean = s.reversed() == s

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}
