// LoopingAndRanges/IndexIntoString.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val s = "abc"
  for (i in 0..s.lastIndex) {
    print(s[i] + 1)
  }
}
/* Output:
bcd
*/
