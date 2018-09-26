// SafeCallsAndElvis/SafeOperation.kt

fun String.echo() {
  println(this.toUpperCase())
  println(this)
  println(this.toLowerCase())
}

fun main() {
  val s1: String? = "Howdy!"
  s1?.echo()                     // [1]
  val s2: String? = null
  s2?.echo()                     // [2]
}
/* Output:
HOWDY!
Howdy!
howdy!
*/
