// Summary1/StringIteration.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  for (c in "Kotlin") {
    print("$c ")
    // c += 1 // error:
    // val cannot be reassigned
  }
}
/* Output:
K o t l i n
*/
