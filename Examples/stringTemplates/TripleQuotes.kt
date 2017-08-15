// stringTemplates/TripleQuotes.kt
fun main(args: Array<String>) {
  val s = "value"
  println("s = \"$s\".")
  println("""s = "$s".""")
}
/* Output:
s = "value".
s = "value".
*/
