// BreakAndContinue/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package breakAndContinueExercise3

fun usingBreak(list: List<Int>) {
  println("before")
  analyzeList(list)
  println("after")
}

fun analyzeList(list: List<Int>) {
  for (i in list) {
    if (i == 0) return
    println("analyzing $i")
  }
}

fun usingContinue(list: List<Int>) {
  println("before")
  for (i in list) {
    analyzeElement(i)
  }
  println("after")
}

fun analyzeElement(i: Int) {
  if (i == 0) return
  println("analyzing $i")
}

fun main() {
  val list = listOf(1, 2, 0, 3, 4)
  println("Using break")
  usingBreak(list)
  println()
  println("Using continue")
  usingContinue(list)
}
/* Output:
Using break
before
analyzing 1
analyzing 2
after

Using continue
before
analyzing 1
analyzing 2
analyzing 3
analyzing 4
after
*/
