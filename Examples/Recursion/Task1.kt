// Recursion/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package recursionExercise1

tailrec fun simulation(group: String, level: Int) {
  println("Simulation: $group Reality: $level")
  if (level > 0) simulation(group, level - 1)
}

fun main() {
//  simulation("FOO", 10)
}
