// DataTypes/Types.kt

fun main() {
  val whole: Int = 11              // [1]
  val fractional: Double = 1.4     // [2]
  val trueOrFalse: Boolean = true  // [3]
  val words: String = "A value"    // [4]
  val character: Char = 'z'        // [5]
  val lines: String = """Triple quotes let
you have many lines
in your string"""                  // [6]

  println(whole)
  println(fractional)
  println(trueOrFalse)
  println(words)
  println(character)
  println(lines)
}
/* Output:
11
1.4
true
A value
z
Triple quotes let
you have many lines
in your string
*/
