// Exceptions/Toss.kt
package toss
import atomictest.*

data class Except1(val why: String):
  Exception(why)

data class Except2(val n: Int):
  IllegalArgumentException(n.toString())

data class Except3(
  val msg: String, val d: Double):
  IllegalStateException("$msg: $d")

fun toss(which: Int) = when(which) {
  1 -> throw Except1("Reason")
  2 -> throw Except2(11)
  3 -> throw Except3("Wanted", 1.618)
  else -> "OK"
}

fun main(args: Array<String>) {
  capture {
    throw Except1("One")
  } eq "Except1"
  capture {
    throw Except2(2)
  } eq "Except2"
  capture {
    throw Except3("Three", 3.0)
  } eq "Except3"
}
