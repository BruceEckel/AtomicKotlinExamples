// summary1/ThreeQuotes.kt
fun json(q: String, a: Int) = """{
    "question" : "$q",
    "answer" : $a
}"""

fun main(args: Array<String>) {
  println(json("The Ultimate", 42))
}
/* Output:
{
    "question" : "The Ultimate",
    "answer" : 42
}
*/
