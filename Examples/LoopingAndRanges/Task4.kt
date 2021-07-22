// LoopingAndRanges/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for (i in 1..n) {
    repeat(i) {
      print("#")
    }
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/
