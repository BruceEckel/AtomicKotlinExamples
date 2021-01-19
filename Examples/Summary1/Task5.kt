// Summary1/Task5.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  for (i in start..end) {
    if ((i - start) % 5 == 4) {
      println(i)
    }
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/
