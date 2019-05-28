// NothingType/FunctionReturningNothing.kt
package nothingtype
import atomictest.*

class MyException(msg: String): Exception(msg)

fun fail(i: Int): Nothing =
  throw MyException("Something is wrong ($i)")

fun main() {
  capture {
    fail(1)
  } eq "MyException: Something is wrong (1)"
  capture {
    fail(2)
  } eq "MyException: Something is wrong (2)"
}
