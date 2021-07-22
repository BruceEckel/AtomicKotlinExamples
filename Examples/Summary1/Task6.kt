// Summary1/Task6.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var i = 1
  for (c in s) {
    if (i % 5 == 0 && c != ' ') {
      println(c)
    }
    if (c != ' ') i++
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/
