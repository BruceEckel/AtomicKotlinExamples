// forAndRanges/IndexIntoString.kt
fun main(args: Array<String>) {
  val s = "abc"
  for (i in 0..s.lastIndex) {
    print(s[i] + 1)
  }
}
/* Output:
bcd
*/
