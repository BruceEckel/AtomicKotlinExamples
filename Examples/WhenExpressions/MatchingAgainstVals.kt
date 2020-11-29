// WhenExpressions/MatchingAgainstVals.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  val yes = "A"
  val no = "B"
  for (choice in listOf(yes, no, yes)) {
    when (choice) {
      yes -> trace("Hooray!")
      no -> trace("Too bad!")
    }
    // The same logic using 'if':
    if (choice == yes) trace("Hooray!")
    else if (choice == no) trace("Too bad!")
  }
  trace eq """
    Hooray!
    Hooray!
    Too bad!
    Too bad!
    Hooray!
    Hooray!
  """
}
