// moreAboutRanges/CharRange.kt
fun isDigit(ch: Char) = ch in '0'..'9'

fun isNotDigit(ch: Char) = ch !in '0'..'9'  // [1]

fun main(args: Array<String>) {
  println(isDigit('a'))
  println(isDigit('5'))
  println(isNotDigit('z'))
}
/* Output:
false
true
true
*/
