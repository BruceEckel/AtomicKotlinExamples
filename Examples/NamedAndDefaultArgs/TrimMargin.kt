// NamedAndDefaultArgs/TrimMargin.kt

fun main(args: Array<String>) {
  val poem = """
    |I went down to the river,
    |I set down on the bank.
    |I tried to think but couldn't,
    |So I jumped in and sank.""".trimMargin()
  println(poem)
}
/* Output:
I went down to the river,
I set down on the bank.
I tried to think but couldn't,
So I jumped in and sank.
*/
