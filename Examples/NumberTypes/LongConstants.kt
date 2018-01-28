// NumberTypes/LongConstants.kt

fun main(args: Array<String>) {
  val i = 0          // Infers Int
  val l1 = 0L        // Infers Long
  val l2: Long = 0
  println("$l1 $l2")
}
/* Output:
0 0
*/
