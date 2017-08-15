// summary1/IterateThroughString.kt
fun main(args: Array<String>) {
  for (c in "Kotlin") {
    print("$c ")
    // c += 1 // error:
    // val cannot be reassigned
  }
}
/* Output:
K o t l i n
*/
