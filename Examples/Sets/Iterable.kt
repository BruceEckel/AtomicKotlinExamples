// Sets/Iterable.kt

fun processIterable(iterable: Iterable<Int>) {
  print("(")
  for (i in iterable) {
    print(i)
  }
  print(")")
}

fun processCollection(
  collection: Collection<Int>
) {
  processIterable(collection)
}

fun main(args: Array<String>) {
  processIterable(1..7)
  processIterable(listOf(1, 2, 3, 4, 5))
  processCollection(listOf(1, 2, 3))
  processCollection(setOf(1, 1, 1))
}
/* Output:
(1234567)(12345)(123)(1)
*/
