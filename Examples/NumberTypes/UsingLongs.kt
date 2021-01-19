// NumberTypes/UsingLongs.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val i = Int.MAX_VALUE
  println(0L + i + i)              // [1]
  println(1_000_000 * 1_000_000L)  // [2]
}
/* Output:
4294967294
1000000000000
*/
