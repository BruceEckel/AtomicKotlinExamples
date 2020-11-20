// Summary1/Task6.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise6

fun everyFifthNonWhitespace(s: String) {
  var i = 1
  for (c in s) {
    if (i % 5 == 0 && c != ' ') {
      println(c)
    }
    if (c != ' ') i++
  }
}

fun main() {
  everyFifthNonWhitespace("abc d e fgh ik")
}
/* Output:
e
k
*/
