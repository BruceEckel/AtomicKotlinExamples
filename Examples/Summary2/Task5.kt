// Summary2/Task5.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summaryIIExercise5

fun va1(vararg ints: Int) {
  println("va1:")
  for (i in ints) {
    println(i)
  }
}

fun va2(vararg ints: Int) {
  println("va2:")
  va1(*ints)
}

fun main() {
/*
  va1(1, 2, 3)
  va2(4, 5, 6)
*/
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */
