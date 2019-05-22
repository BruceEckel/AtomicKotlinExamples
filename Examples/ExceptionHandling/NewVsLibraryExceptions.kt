// ExceptionHandling/NewVsLibraryExceptions.kt
package errorHandling
import atomictest.*

class IncorrectInputException(
  message: String
) : Exception(message)

fun checkCode(code: Int) {
  if (code < 1000) {
    throw IncorrectInputException(
      "Code should be more than 1000: $code")
  }
}

fun main() {
  try {
    val code = "A1".toInt(16)
    checkCode(code)
  } catch (e: IncorrectInputException) {
    e.message eq
      "Code should be more than 1000: 161"
  }
  capture {
    try {
      val code = "1".toInt(1)
      checkCode(code)
    } catch (e: IncorrectInputException) {
      // we don't get here
    }
  } eq
    "IllegalArgumentException: " +
    "radix 1 was not in valid range 2..36"
}
