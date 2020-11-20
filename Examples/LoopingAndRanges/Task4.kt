// LoopingAndRanges/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package loopingAndRangesExercise4

fun printHalfPyramid(n: Int) {
  for (i in 1..n) {
    repeat(i) {
      print("#")
    }
    println()
  }
}

fun main() {
  printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/
