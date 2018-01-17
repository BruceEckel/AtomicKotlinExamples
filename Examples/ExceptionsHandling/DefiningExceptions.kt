// ExceptionsHandling/DefiningExceptions.kt
package toss
import atomictest.*

data class Except1(val why: String):
  Exception(why)

data class Except2(val n: Int):
  IllegalArgumentException(n.toString())

data class Except3(
  val msg: String, val d: Double):
  IllegalStateException("$msg: $d")

fun main(args: Array<String>) {
  capture {
    throw Except1("One")
  } eq "Except1: One"
  capture {
    throw Except2(2)
  } eq "Except2: 2"
  capture {
    throw Except3("Three", 3.0)
  } eq "Except3: Three: 3.0"
}
