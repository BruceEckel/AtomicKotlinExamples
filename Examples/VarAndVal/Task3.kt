// VarAndVal/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val tmp = x
  x = y
  y = tmp
  println(x)
  println(y)
}
