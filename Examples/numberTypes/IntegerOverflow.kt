// numberTypes/IntegerOverflow.kt
fun main(args: Array<String>) {
  val i: Int = Int.MAX_VALUE
  println(i + i)
}
/* Output:
-2
*/
