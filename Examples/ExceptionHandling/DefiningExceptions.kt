// ExceptionHandling/DefiningExceptions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandling
import atomictest.*

class Exception1(
  val value: Int
): Exception("wrong value: $value")

open class Exception2(
  description: String
): Exception(description)

class Exception3(
  description: String
): Exception2(description)

fun main() {
  capture {
    throw Exception1(13)
  } eq "Exception1: wrong value: 13"
  capture {
    throw Exception3("error")
  } eq "Exception3: error"
}
