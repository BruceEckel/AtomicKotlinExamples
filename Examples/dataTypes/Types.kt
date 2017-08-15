// dataTypes/Types.kt
fun main(args: Array<String>) {
  val whole: Int = 11              // [1]
  val fractional: Double = 1.4     // [2]
  // true or false:
  val trueOrFalse: Boolean = true  // [3]
  val words: String = "A value"    // [4]
  val lines: String = """Triple quotes let
you have many lines
target your string"""              // [5]

  println(whole)
  println(fractional)
  println(trueOrFalse)
  println(words)
  println(lines)
}
/* Output:
11
1.4
true
A value
Triple quotes let
you have many lines
target your string
*/
