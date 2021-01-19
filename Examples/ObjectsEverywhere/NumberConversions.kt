// ObjectsEverywhere/NumberConversions.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun fraction(numerator: Long, denom: Long) =
  numerator.toDouble() / denom

fun main() {
  val num = 1
  val den = 2
  val f = fraction(num.toLong(), den.toLong())
  println(f)
}
/* Output:
0.5
*/
