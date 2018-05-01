// Summary2/ArraySpread.kt

fun main(args: Array<String>) {
  val array = intArrayOf(4, 5)
  varargs("x", 1, 2, 3, *array, 6)  // [1]
  val list = listOf(9, 10, 11)
  varargs(
    "y", 7, 8, *list.toIntArray())  // [2]
}
/* Output:
1 2 3 4 5 6 x
7 8 9 10 11 y
*/
