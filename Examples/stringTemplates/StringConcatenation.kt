// stringTemplates/StringConcatenation.kt
fun main(args: Array<String>) {
  val s = "hi\n"          // [1]
  val n = 11
  val d = 3.14
  println("first: " + s + "second: " +
    n + ", third: " + d)
}
/* Output:
first: hi
second: 11, third: 3.14
*/
