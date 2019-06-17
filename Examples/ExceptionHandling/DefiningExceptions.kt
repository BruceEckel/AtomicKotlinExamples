// ExceptionHandling/DefiningExceptions.kt
package exceptionhandling
import atomictest.*

class Exception1(
  val value: Int
): Exception("wrong value: $value")

open class Exception2(
  message: String
): Exception(message)

class Exception3(
  message: String
): Exception2(message)

fun main() {
  capture {
    throw Exception1(13)
  } eq "Exception1: wrong value: 13"
  capture {
    throw Exception3("error")
  } eq "Exception3: error"
}
