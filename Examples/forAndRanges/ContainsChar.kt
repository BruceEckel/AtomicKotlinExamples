// forAndRanges/ContainsChar.kt
fun containsChar(s: String, ch: Char): Boolean {
  for (c in s) {
    if (c == ch)
      return true
  }
  return false
}

fun main(args: Array<String>) {
  println(containsChar("kotlin", 't'))
  println(containsChar("kotlin", 'a'))
}
/* Output:
true
false
*/
