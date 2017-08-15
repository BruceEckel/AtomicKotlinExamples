// summary1/StrTemplates.kt
fun main(args: Array<String>) {
  val answer = 42
  println("Found $answer!")                  // [1]
  val condition = true
  println("${if (condition) 'a' else 'b'}")  // [2]
  println("printing a $1")                   // [3]
}
/* Output:
Found 42!
a
printing a $1
*/
