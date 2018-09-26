// ErrorReporting/ElvisWithException.kt
import atomictest.capture
import atomictest.eq

class ElvisException(m: String) : Exception(m)

fun maybeNullString(s: String?) =
  s?.length
    ?: throw ElvisException("s " +
      "cannot be null")

fun main() {
  maybeNullString("Not a null String") eq 17
  capture {
    maybeNullString(null)
  } eq "ElvisException: s cannot be null"
}
