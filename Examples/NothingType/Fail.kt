// NothingType/Fail.kt
package nothingtype
import atomictest.*

class MyException(msg: String): Exception(msg)

fun fail(i: Int): Nothing =
  throw MyException("Failure $i")

fun main() {
  capture {
    fail(1)
  } eq "MyException: Failure 1"
  capture {
    fail(2)
  } eq "MyException: Failure 2"
}
