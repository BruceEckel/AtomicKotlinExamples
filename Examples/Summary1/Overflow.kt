// Summary1/Overflow.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  println(Int.MAX_VALUE + 1)
  println(Int.MAX_VALUE + 1L)
}
/* Output:
-2147483648
2147483648
*/
