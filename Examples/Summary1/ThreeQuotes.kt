// Summary1/ThreeQuotes.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

fun json(q: String, a: Int) = """{
  "question" : "$q",
  "answer" : $a
}"""

fun main() {
  println(json("The Ultimate", 42))
}
/* Output:
{
  "question" : "The Ultimate",
  "answer" : 42
}
*/
