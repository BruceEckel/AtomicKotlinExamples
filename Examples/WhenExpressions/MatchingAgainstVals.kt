// WhenExpressions/MatchingAgainstVals.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val yes = "yes"
  val no = "no"
  val choice = readLine()
  when (choice) {
    yes -> println("Hooray!")
    no -> println("Too bad!")
  }
  // The same code rewritten with if:
  if (choice == yes) println("Hooray!")
  else if (choice == no) println("Too bad!")
}
/* Input/Output:
>>> yes
Hooray!
Hooray!
*/
