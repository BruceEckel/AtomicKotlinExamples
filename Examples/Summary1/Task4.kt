// Summary1/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIExercise4

fun testLong() {
  println(Long.MAX_VALUE + 1)
}

fun testDouble() {
  println(Double.MAX_VALUE + 1)
}

fun testDouble2() {
  println(Double.MAX_VALUE + 1 == Double.MAX_VALUE)
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
true
 */
