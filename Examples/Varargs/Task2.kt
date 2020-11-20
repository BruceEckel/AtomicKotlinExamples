// Varargs/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package variableArgumentListsExercise2

fun printArgs(s: String, vararg ints: Int) {
  println("$s${ints.toList()}")
}

fun main() {
//  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */
