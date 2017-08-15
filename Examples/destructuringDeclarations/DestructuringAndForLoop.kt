// destructuringDeclarations/DestructuringAndForLoop.kt
fun main(args: Array<String>) {
  val map = mapOf(1 to "one", 2 to "two")
  for ((key, value) in map) {
    print("$key = $value, ")
  }
  println()

  val listOfPairs =
      listOf(Pair(1, "one"), Pair(2, "two"))
  for ((i, s) in listOfPairs) {
    print("($i, $s), ")
  }
}
/* Output:
1 = one, 2 = two,
(1, one), (2, two),
*/
