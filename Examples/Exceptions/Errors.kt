// Exceptions/Errors.kt
package toss

data class Except1(val why: String):
  Exception(why)

data class Except2(val n: Int):
  Exception(n.toString())

data class Except3(
  val msg: String, val d: Double):
  Exception("$msg: $d")

fun toss(which: Int) = when(which) {
  1 -> throw Except1("Reason")
  2 -> throw Except2(11)
  3 -> throw Except3("Wanted", 1.618)
  else -> "OK"
}
